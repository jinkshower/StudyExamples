-- 음식점별 시간별 주문건수 Pivot Table 뷰 만들기 (15~20시 사이, 20시 주문건수 기준 내림차순)
SELECT restaurant_name,
	   max(if(hh='15', cnt_order, 0)) "15",
       max(if(hh='16', cnt_order, 0)) "16",
       max(if(hh='17', cnt_order, 0)) "17",
       max(if(hh='18', cnt_order, 0)) "18",
       max(if(hh='19', cnt_order, 0)) "19",
       max(if(hh='20', cnt_order, 0)) "20"
FROM 
(
select restaurant_name,
		substr(p.time, 1, 2) hh,
		count(1) cnt_order
from food_orders fo inner join payments p on fo.order_id = p.order_id 
where substr(p.time, 1, 2) between 15 and 20
group by 1, 2
) a
group by 1
order by 7 desc

-- 성별, 연령별 주문건수 Pivot Table 뷰 만들기  (나이는 10~59세 사이, 연령 순으로 내림차순)
select age,
       max(if(gender='male', order_count, 0)) male,
       max(if(gender='female', order_count, 0)) female
from 
(
select b.gender,
       case when age between 10 and 19 then 10
            when age between 20 and 29 then 20
            when age between 30 and 39 then 30
            when age between 40 and 49 then 40
            when age between 50 and 59 then 50 end age,
       count(1) order_count
from food_orders a inner join customers b on a.customer_id=b.customer_id
where b.age between 10 and 59
group by 1, 2
) t
group by 1
order by age

-- N 번째까지의 대상을 조회하고 싶을 때, Rank
SELECT cuisine_type,
	   restaurant_name,
	   cnt_order,
	   ranking
FROM 
(
SELECT cuisine_type,
	   restaurant_name,
	   rank() over(partition by cuisine_type order by cnt_order desc) ranking,
	   cnt_order
FROM 
(
SELECT cuisine_type ,
		restaurant_name ,
		count(1) cnt_order
FROM food_orders fo 
group by 1,2
) a
) b
where ranking <= 3
order by 1, 3 desc

-- 전체에서 차지하는 비율, 누적합을 구할 때, Sum
select cuisine_type,
       restaurant_name,
       order_count,
       sum(order_count) over (partition by cuisine_type) sum_cuisine_type,
       sum(order_count) over (partition by cuisine_type order by order_count, restaurant_name) cumulative_sum
from
(
select cuisine_type, restaurant_name, count(1) order_count
from food_orders
group by 1, 2
) a

-- 3월 조건으로 지정하고, 년도별로 정렬하기
select date_format(date(date), '%Y') y,
       date_format(date(date), '%m') m,
       count(1) order_count
from food_orders a inner join payments b on a.order_id=b.order_id
where date_format(date(date), '%m')='03'
group by 1, 2
order by 1
