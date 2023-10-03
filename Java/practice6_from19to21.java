////class MyTv {
////
////    boolean isPowerOn;
////
////    int channel;
////
////    int volume;
////
////
////
////    final int MAX_VOLUME = 100;
////
////    final int MIN_VOLUME = 0;
////
////    final int MAX_CHANNEL = 100;
////
////    final int MIN_CHANNEL = 1;
////
////
////
////    void turnOnOff() {
////
////        // (1) isPowerOn의 값이 true면 false로, false면 true로 바꾼다.
////        isPowerOn = !isPowerOn;
////    }
////
////
////
////    void volumeUp() {
////
////        // (2) volume의 값이 MAX_VOLUME보다 작을 때만 값을 1 증가시킨다.
////        if (volume < MAX_VOLUME) {
////            volume++;
////        }
////    }
////
////
////
////    void volumeDown() {
////
////        // (3) volume의 값이 MIN_VOLUME보다 클 때만 값을 1 감소시킨다.
////        if (volume > MIN_VOLUME) {
////            volume--;
////        }
////
////    }
////
////
////
////    void channelUp() {
////
////        // (4) channel의 값을 1 증가시킨다.
////
////        // 만일 channel이 MAX_CHANNEL이면 , channel의 MIN_CHANNEL 값을 로 바꾼다.
////        if (channel == MAX_CHANNEL) {
////            channel = MIN_CHANNEL;
////            return;
////        }
////        channel++;
////    }
////
////
////
////    void channelDown() {
////
////        // (5) channel의 값을 1 감소시킨다 .
////
////        // 만일 channel이 MIN_CHANNEL이면, channel의 값을 MAX_CHANNEL 로 바꾼다.
////        if (channel == MIN_CHANNEL) {
////            channel = MAX_CHANNEL;
////            return;
////        }
////        channel--;
////    }
////
////}
//
//
//
//public class Main {
////    static int max(int[] arr) {
////        if (arr == null || arr.length == 0) {
////            return -999999;
////        }
////        int max = arr[0];
////        for (int i = 0; i < arr.length; i++) {
////            if (arr[i] > max) {
////                max = arr[i];
////            }
////        }
////        return max;
////    }
//    public static int abs(int value) {
//        if (value >= 0) {
//            return value;
//        }
//        if (value < 0) {
//            return -value;
//        }
//        return 0;
//    }
//
//    public static void main(String[] args) {
//        int value = 5;
//        System.out.println(value+" :"+abs(value));
//        value = -10;
//        System.out.println(value+" :"+abs(value));
////        int[] data = {3,2,9,4,7};
////        System.out.println(java.util.Arrays.toString(data));
////        System.out.println(" :"+max(data));
////        System.out.println(" :"+max(null));
////        System.out.println(" :"+max(new int[]{}));
//
////        MyTv t = new MyTv();
////
////
////
////        t.channel = 100;
////
////        t.volume = 0;
////
////        System.out.println("CH:" + t.channel + ", VOL:" + t.volume);
////
////
////
////        t.channelDown();
////
////        t.volumeDown();
////
////        System.out.println("CH:" + t.channel + ", VOL:" + t.volume);
////
////
////
////        t.volume = 100;
////
////        t.channelUp();
////
////        t.volumeUp();
////
////        System.out.println("CH:" + t.channel + ", VOL:" + t.volume);
//
//
//    }
//
//}