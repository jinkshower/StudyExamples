//import java.util.HashSet;
//import java.util.Iterator;
//
//public class Main {
//    public static void main(String[] args) {
//        HashSet setA = new HashSet<>();
//        HashSet setB = new HashSet<>();
//        HashSet setHab = new HashSet<>();
//        HashSet setKyo = new HashSet<>();
//        HashSet setCha = new HashSet<>();
//
//        setA.add("1");
//        setA.add("2");
//        setA.add("3");
//        setA.add("4");
//        setA.add("5");
//
//        setB.add("4");
//        setB.add("5");
//        setB.add("6");
//        setB.add("7");
//        setB.add("8");
//        //교집합
//        Iterator it = setB.iterator();
//        while(it.hasNext()) {
//            Object tmp = it.next();
//            if (setA.contains(tmp)) {
//                setKyo.add(tmp);
//            }
//        }
//
//        it = setA.iterator();
//        while(it.hasNext()) {
//            Object tmp = it.next();
//            if (!setB.contains(tmp)) {
//                setCha.add(tmp);
//            }
//        }
//
//        it = setA.iterator();
//        while(it.hasNext()) {
//            setHab.add(it.next());
//        }
//
//        it = setB.iterator();
//        while(it.hasNext()) {
//            setHab.add(it.next());
//        }
//    }
//}
