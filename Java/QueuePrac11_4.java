//import java.util.LinkedList;
//import java.util.ListIterator;
//import java.util.Queue;
//import java.util.Scanner;
//
//public class Main {
//    static Queue q = new LinkedList();
//    static final int MAX_SIZE = 5;
//
//    public static void main (String[] args) {
//        System.out.println("Enter help to see the instruction");
//
//        while (true) {
//            System.out.println(">>");
//            try {
//                Scanner scanner = new Scanner(System.in);
//                String input = scanner.nextLine().trim();
//
//                if (input.isEmpty()) {
//                    continue;
//                }
//
//                if (input.equalsIgnoreCase("q")) {
//                    System.exit(0);
//                }
//                else if (input.equalsIgnoreCase("help")) {
//                    System.out.println("help - show instruction");
//                    System.out.println("q or Q - exit the program");
//                    System.out.println("history - show the history of inputs");
//                }
//                else if (input.equalsIgnoreCase("history")) {
//                    int i = 0;
//                    save(input);
//
//                    LinkedList tmp = (LinkedList) q;
//                    ListIterator it = tmp.listIterator();
//
//                    while(it.hasNext()) {
//                        System.out.println(++i + "." + it.next());
//                    }
//                }else {
//                    save(input);
//                    System.out.println(input);
//                }
//            } catch(Exception e) {
//                System.out.println("Input Error");
//            }
//        }
//    }
//
//    public static void save(String input) {
//        if (!"".equals(input)) {
//            q.offer(input);
//        }
//
//        if (q.size() > MAX_SIZE) {
//            q.poll();
//        }
//    }
//}
