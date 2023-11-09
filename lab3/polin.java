package lab3;
import java.util.Scanner;

public class polin {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Introduceti sirul n = ");
        String n = in.nextLine();
        String invers="";
        int lenght= n.length();

        for(int i= lenght-1; i>=0; i--) {
            invers = invers + n.charAt(i);
        }
           if(n.equals(invers)){
            System.out.println(n + " is palindrome ");
           }
           else {
               System.out.println(n + " is not palindrome");

           }
    }
}