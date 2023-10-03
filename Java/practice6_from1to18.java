//
//
//
////class MyPoint {
////    int x;
////    int y;
////
////    MyPoint (int x, int y) {
////        this.x = x;
////        this.y = y;
////    }
////
////    double getDistance (int x1, int y1) {
////        int hor = x1 - x;
////        int ver = y1 - y;
////        double distance = Math.pow(hor, 2) + Math.pow(ver, 2);
////        return Math.sqrt(distance);
////    }
////}
//
//public class practice6_from1to18 {
////    static int[] shuffle(int[] arr) {
////        if(arr==null || arr.length==0)
////            return arr;
////        int tmp = 0;
////        for (int i = 0; i < arr.length; i++) {
////            int index = (int) (Math.random() * arr.length);
////            tmp = arr[i];
////            arr[i] = arr[index];
////            arr[index] = tmp;
////        }
////        return arr;
////    }
////    static boolean isNumber (String str) {
////        if (str == null || str.isEmpty()) {
////            return false;
////        }
////        for (int i = 0; i < str.length(); i++) {
////            if (str.charAt(i) < '0' || str.charAt(i) > '9') {
////                return false;
////            }
////        }
////        return true;
////    }
//    public static void main(String[] args) {
////        String str = "123";
////        System.out.println(str+" ? "+isNumber(str));
////        str = "1234o";
////        System.out.println(str+" ? "+isNumber(str));
////        int[] original = {1,2,3,4,5,6,7,8,9};
////        System.out.println(java.util.Arrays.toString(original));
////        int[] result = shuffle(original);
////        System.out.println(java.util.Arrays.toString(result));
//
////        MyPoint p = new MyPoint(1,1);
////
////        System.out.println(p.getDistance(2, 2));
////        System.out.println(getDistance(1,1, 2,2));
////        Student s = new Student("홍길동",1,1,100,60,76);
////        System.out.println("이름 :"+s.getName());
////        System.out.println("총점 :"+s.getTotal());
////        System.out.println("평균 :"+s.getAverage());
//    }
////    static double getDistance(int x, int y, int x1, int y1) {
////        int hor = x1 - x;
////        int ver = y1 - y;
////        double distance = Math.pow(hor, 2) + Math.pow(ver, 2);
////        return Math.sqrt(distance);
////    }
//}
////class Student {
////    private final String name;
////    private final int ban;
////    private final int no;
////    private final int kor;
////    private final int eng;
////
////    private final int math;
////
////    String getName() {
////        return this.name;
////    }
////
////   int getTotal() {
////        return kor + eng + math;
////    }
////
////    float getAverage() {
////        return (int)(getTotal() / 3f * 10 + 0.5f) / 10f;
////    }
////    Student(String name, int ban, int no, int kor, int eng, int math) {
////        this.name = name;
////        this.ban = ban;
////        this.no = no;
////        this.kor = kor;
////        this.eng = eng;
////        this.math = math;
////    }
////
////    public String info() {
////        return name
////                +","+ban
////                +","+no
////                +","+kor
////                +","+eng
////                +","+math
////                +","+(kor+eng+math)
////                +","+((int)((kor+eng+math) / 3f * 10 + 0.5f) / 10f)
////                ;
////    }
////
////
////}