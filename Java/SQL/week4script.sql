-- 음식점의 평균 단가별 segmentation 을 진행하고, 그룹에 따라 수수료 연산하기
SELECT restaurant_name,
		case when price_per_plate < 5000 then 0.05
			 when price_per_plate < 20000 then 1
			 when price_per_plate < 30000 then 2
			 else 3 end "수수"
FROM 
(
SELECT restaurant_name ,
		avg(price/quantity) price_per_plate
FROM food_orders fo 
group by 1
) a

-- 음식점의 지역과 평균 배달시간으로 segmentation 하기
select restaurant_name,
       sido,
       case when avg_time<=20 then '<=20'
            when avg_time>20 and avg_time <=30 then '20<x<=30'
            when avg_time>30 then '>30' end time_segment
from 
(
select restaurant_name,
       substring(addr, 1, 2) sido,
       avg(delivery_time) avg_time
from food_orders
group by 1, 2
) a

-- 음식 타입별 지역별 총 주문수량과 음식점 수를 연산하고, 주문수량과 음식점수 별 수수료율을 산정하기   
SELECT cuisine_type,
		case when count_res>= 5 and total_quantity>=30 then 0.005
			 when count_res>= 5 and total_quantity<30 then 0.008
			 when count_res< 5 and total_quantity>=30 then 0.01
			 when count_res< 5 and total_quantity<30 then 0.02 end rate
FROM 
(
SELECT cuisine_type ,
		sum(quantity) total_quantity,
		count(distinct restaurant_name) count_res
FROM food_orders fo 
group by 1
) a

-- 음식점의 총 주문수량과 주문 금액을 연산하고, 주문 수량을 기반으로 수수료 할인율 구하기 
SELECT restaurant_name,
		case when total_quantity <= 5 then 0.1
			 when total_quantity > 15 and total_price > 300000 then 0.005
			 else 0.1 end rate
FROM 
(
SELECT restaurant_name ,
		count(quantity) total_quantity,
		sum(price) total_price
FROM food_orders fo 
group by 1
) a

-- 주문 가격과 수수료율을 곱하여 주문별 수수료 구하기
SELECT fo.price ,
		p.vat,
		fo.price * p.vat rate
FROM food_orders fo inner join payments p on fo.order_id = p.order_id 

-- 50세 이상 고객의 연령에 따라 경로 할인율을 적용하고, 음식 타입별로 원래 가격과 할인 적용 가격 합을 구하기 
SELECT cuisine_type,
	   sum(price) total_price,
	   sum(discount) total_discount,
	   sum(price) - sum(discount) after_discount
FROM 
(
SELECT fo.cuisine_type ,
		fo.price,
		c.age,
		fo.price * ((c.age - 50) * 0.005) discount
FROM food_orders fo inner join customers c on fo.customer_id = c.customer_id 
where c.age>=50
) a
group by 1
order by 3 desc
