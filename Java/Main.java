import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        //자바의 정석 4장 연습예제 문제
        //4-1
//        int sum = 0;
//        for (int i = 1; i < 21; i++){
//            if (i % 2 == 0 || i % 3 ==0){
//                continue;
//            }
//            sum += i;
//        }
//        System.out.println(sum);
        //4-2
//        int sum = 0;
//        int totalSum = 0;
//        for (int i = 1; i < 11; i++){
//            sum += i;
//            totalSum += sum;
//        }
//        System.out.println(totalSum);
        //4-3
//        int sum = 0;
//        int s = 1;
//        int num = 0;
//
//        for (int i = 1; sum < 100; i++, s = -s) {
//            sum += i * s;
//            num++;
//        }
//        System.out.println(num);
        //4-5
//        int i = 0;
//        while (i <= 10) {
//            int j = 0;
//            while (j <= i) {
//                System.out.print("*");
//                j++;
//            }
//            System.out.println();
//            i++;
//        }
        //4-6
//        for (int i = 1; i <= 6; i++) {
//            for (int j = 1; j <= 6; j++) {
//                if (i + j == 6){
//                    System.out.printf("result : %d and %d\n", i , j);
//                }
//            }
//        }
        //4-7
//        String str = "12345";
//        int sum = 0;
//        for (int i = 0; i < str.length(); i++) {
//            sum += str.charAt(i) - '0';
//        }
//        System.out.println(sum);
        //4-8
//        int value = (int) (Math.random() * 6) + 1;
//        System.out.println(value);
        //4-9
//        int num = 12345;
//        int sum = 0;
//
//        while (num > 0) {
//            sum += num % 10;
//            num /= 10;
//        }
//        System.out.println(sum);
        //4-10
//        int answer = (int) (Math.random() * 100) + 1;
//        int input = 0;
//        int count = 0;
//
//        Scanner s = new Scanner(System.in);
//
//        do {
//            count++;
//            System.out.println("Integar between 1 and 100: ");
//            input = s.nextInt();
//
//            if (input < answer) {
//                System.out.println("Please enter bigger number");
//            }
//
//            if (input > answer) {
//                System.out.println("Please enter smaller number");
//            }
//
//            if (input == answer) {
//                System.out.println("correct");
//                System.out.println("The try count was : " + count);
//                break;
//            }
//        } while (true);
    }
}