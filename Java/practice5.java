//import java.util.Arrays;
//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        //lotto generator
////        int[] ball = new int[45];
////        for (int i = 0; i < ball.length; i++) {
////            ball[i] = i + 1;
////        }
////
////        int tmp = 0;
////        int j = 0;
////
////        for (int i = 0; i < 6; i++) {
////            j = (int) (Math.random() * 45);
////            tmp = ball[i];
////            ball[i] = ball[j];
////            ball[j] = tmp;
////        }
////
////        for (int i = 0; i < 6; i++) {
////            System.out.printf("ball[%d]=%d%n",i, ball[i]);
////        }
////        //5-3
////        int [] arr = {10, 20, 30, 40, 50};
////        int sum = 0;
////
////        for (int i = 0; i < arr.length; i++) {
////            sum += arr[i];
////        }
////
////        System.out.println(sum);
//        //5-4
////        int[][] arr = { { 5, 5, 5, 5, 5 }, { 10, 10, 10, 10, 10 },
////                { 20, 20, 20, 20, 20 }, { 30, 30, 30, 30, 30 } };
////
////        int total = 0;
////        float average = 0;
////
////        for (int i = 0; i < arr.length; i++) {
////            for (int j = 0; j <arr[i].length; j++) {
////                total += arr[i][j];
////            }
////        }
////        average = (float) total / (arr.length * arr[0].length);
////
////        System.out.println("total=" + total);
////        System.out.println("average=" + average);
//        //5-5
////        int[] ballArr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
////        int[] ball3 = new int[3];
////
////        // 배열 ballArr의 임의의 요소를 골라서 위치를 바꾼다.
////        for (int i = 0; i < ballArr.length; i++) {
////            int j = (int) (Math.random() % ballArr.length);
////            int tmp = 0;
////
////            tmp = ballArr[i];
////            ballArr[i] = ballArr[j];
////            ballArr[j] = tmp;
////        }
////        // 배열 ballArr의 앞에서 3개의 수를 배열 ball3로 복사한다.
////        //
//////         ball3 = Arrays.copyOfRange(ballArr, 0, 3);
////        System.arraycopy(ballArr, 0, ball3, 0, 3);
////
////        for (int i = 0; i < ball3.length; i++) {
////            System.out.print(ball3[i]);
////        }
////        String[] words = { "television", "computer", "mouse", "phone" };
////
////        Scanner scanner = new Scanner(System.in);
////
////        for (int i = 0; i < words.length; i++) {
////            char[] question = words[i].toCharArray(); // String을 char[]로 변환
////
////            int m = (int) (Math.random() * question.length);
////            char tmp = ' ';
////            for (int j = 0; j < question.length; j++) {
////                tmp = question[m];
////                question[m] = question[j];
////                question[j] = tmp;
////            }
////
////            System.out.printf("Q%d. %s의 정답을 입력하세요 .>", i + 1, new String(
////                    question));
////            String answer = scanner.nextLine();
////
////            // trim()으로 answer의 좌우 공백을 제거한 후 , equals로 word[i]와 비교
////            if (words[i].equals(answer.trim()))
////                System.out.printf("맞았습니다.%n%n");
////            else
////                System.out.printf("틀렸습니다.%n%n");
////        }
//
//    }
//}
