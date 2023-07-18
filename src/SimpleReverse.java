import java.util.Scanner;

public class SimpleReverse {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String string=scanner.next();
        String answer="";
        for (int i = string.length()-1; i >=0 ; i--) {
            answer+=string.charAt(i);
        }
        System.out.println("Answer: "+answer);
    }
}
