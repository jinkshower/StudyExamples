//9-1
//public class Main {
//    public static void main(String[] args) {
//        SutdaCard c1 = new SutdaCard(3,true);
//        SutdaCard c2 = new SutdaCard(3,true);
//        System.out.println("c1="+c1);
//        System.out.println("c2="+c2);
//        System.out.println("c1.equals(c2):"+c1.equals(c2));
//    }
//}
//
//class SutdaCard {
//    int num;
//    boolean isKwang;
//
//    SutdaCard() {
//        this(1, true);
//    }
//
//    SutdaCard(int num, boolean isKwang) {
//        this.num = num;
//        this.isKwang = isKwang;
//    }
//
//    public boolean equals(Object obj) {
//        if(obj instanceof SutdaCard) {
//            SutdaCard objCard = (SutdaCard) obj;
//            return this.num == objCard.num && this.isKwang == objCard.isKwang;
//        }
//        return false;
//    }
//
//    public String toString() {
//        return num + (isKwang ? "K": "");
//    }
//}
//9-2
//public class Main {
//    public static void main(String[] args) {
//        Point3D p1 = new Point3D(1,2,3);
//        Point3D p2 = new Point3D(1,2,3);
//        System.out.println(p1);
//        System.out.println(p2);
//        System.out.println("p1==p2?"+(p1==p2));
//        System.out.println("p1.equals(p2)?"+(p1.equals(p2)));
//    }
//}
//
//class Point3D {
//    int x, y, z;
//
//    Point3D (int x, int y, int z) {
//        this.x = x;
//        this.y = y;
//        this.z = z;
//    }
//
//    Point3D() {
//        this(0, 0, 0);
//    }
//
//    public boolean equals(Object obj) {
//        if (obj instanceof Point3D) {
//            Point3D newPoint = (Point3D) obj;
//            return this.x == newPoint.x && this.y == newPoint.y && this.z == newPoint.z;
//        }
//        return false;
//    }
//
//    public String toString() {
//        //my answer
//        StringJoiner sj = new StringJoiner(",", "[", "]");
//        String[] strArr = {String.valueOf(x), String.valueOf(y),String.valueOf(z)};
//        for(String s: strArr) {
//            sj.add(s);
//        }
//        return sj.toString();
//        //book answer
//        return "[" + x + "," + y + "," + z + "]";
//    }
//}
//9-3
//public class Main {
//    public static void main(String[] args) {
//        System.out.println(count("12345AB12AB345AB","AB"));
//        System.out.println(count("12345","AB"));
//    }
//    public static int count(String src, String target) {
//        int count = 0;
//        int pos = 0;
//        //my answer
//        for (int i = 0; i < src.length(); i++) {
//            int index = src.indexOf(target, pos);
//            if (index > 0) {
//                count++;
//                pos += index;
//            }
//            if (index == -1) {
//                return count;
//            }
//        }
//        return count;
//        //book answer
//        while(true) {
//            pos = src.indexOf(target, pos);
//            if(pos != -1) {
//                count++;
//                pos += target.length();
//            }
//            if (pos == -1) {
//                break;
//            }
//        }
//        return count;
//    }
//}
//9-4
//public class Main {
//
//    public static boolean contains(String src, String target) {
//        return src.contains(target);
//    }
//
//    public static void main(String[] args) {
//        System.out.println(contains("12345","23"));
//        System.out.println(contains("12345","67"));
//    }
//}
//9-5
//public class Main {
//    public static String delChar(String src, String delCh) {
//        StringBuilder sb = new StringBuilder(src.length());
//        for (int i = 0; i < src.length(); i++) {
//            char c = src.charAt(i);
//            if (!delCh.contains(c + "")) {
//                sb.append(c);
//            }
//        }
//        return sb.toString();
//    }
//
//    public static void main(String[] args) {
//        System.out.println("(1!2@3^4~5)"+" -> "
//                + delChar("(1!2@3^4~5)","~!@#$%^&*()"));
//        System.out.println("(1 2 3 4\t5)"+" -> "
//                + delChar("(1 2 3 4\t5)"," \t"));
//    }
//}
//9-6
//import java.util.*;
//import java.util.regex.*;
//
//public class Main {
//    public static void main(String[] args) {
//        String[] phoneNumArr = { "012-3456-7890", "099-2456-7980",
//                "088-2346-9870", "013-3456-7890" };
//
//        ArrayList list = new ArrayList();
//
//        Scanner s = new Scanner(System.in);
//
//        while (true) {
//            System.out.print(">>");
//
//            String input = s.nextLine().trim();
//
//            if (input.equals("")) {
//                continue;
//
//            } else if (input.equalsIgnoreCase("Q")) {
//                System.exit(0);
//            }
//
//            String pattern = ".*" + input + ".*";
//            Pattern p = Pattern.compile(pattern);
//
//            for (int i = 0; i < phoneNumArr.length; i++) {
//                String phoneNum = phoneNumArr[i];
//                String tmp = phoneNum.replace("-", "");
//
//                Matcher m = p.matcher(tmp);
//
//                if (m.find()) {
//                    list.add(phoneNum);
//                }
//            }
//
//            if (list.size() > 0) {
//                System.out.println(list);
//                list.clear();
//            } else {
//                System.out.println("일치하는 번호가 없습니다 .");
//            }
//        }
//    }// main
//}