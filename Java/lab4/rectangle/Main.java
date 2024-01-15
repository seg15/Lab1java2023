package lab4.rectangle;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Rectangle r = new Rectangle();
        Scanner input = new Scanner(System.in);

        System.out.println("Enter width ");
        r.setWidth(input.nextInt());
        System.out.println("Enter lenght ");
        r.setLength(input.nextInt());


        r.arieperimetru();
    }
}
