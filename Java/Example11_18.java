//import java.util.Arrays;
//import java.util.HashMap;
//import java.util.Iterator;
//import java.util.Map;
//
//public class Main {
//    public static void main(String[] args) {
//        String[] data = {"A", "K", "A","K", "D", "K", "A"};
//
//        HashMap map = new HashMap();
//
//        for (int i = 0; i < data.length; i++) {
//            if (map.containsKey(data[i])) {
//                int value = (int) map.get(data[i]);
//                map.put(data[i], ++value);
//            } else {
//                map.put(data[i], 1);
//            }
//        }
//        Iterator it = map.entrySet().iterator();
//
//        while(it.hasNext()) {
//            Map.Entry entry = (Map.Entry) it.next();
//            int value = (int) entry.getValue();
//            System.out.println(entry.getKey() + " : " + printBar('#', value) + " " + value);
//        }
//    }
//
//    public static String printBar(char ch, int value) {
//        char[] bar = new char[value];
//
//        Arrays.fill(bar, ch);
//        return new String(bar);
//    }
//}
