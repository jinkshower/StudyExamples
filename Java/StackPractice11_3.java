import java.util.EmptyStackException;
import java.util.Stack;

public class Main {
   public static void main(String[] args) {
       Stack st = new Stack();
       String expression = "((3+2) * 8))))";

       System.out.println("expression : " + expression);

       try {
           for (int i = 0; i < expression.length(); i++) {
               char ch = expression.charAt(i);
               if (ch == '(') {
                   st.push(ch);
               }
               if (ch == ')') {
                   st.pop();
               }
           }
           if (st.isEmpty()) {
               System.out.println("Bracket match!");
           }
           if (!st.isEmpty()) {
               System.out.println("Bracket Unmatch!");
           }
       } catch (EmptyStackException e){
           System.out.println("Bracket Unmatch!2222");
       }
   }
}

