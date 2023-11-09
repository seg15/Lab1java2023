package lab3;
import java.util.Scanner;

public class Fibonnaci {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Introduceti numarul de elemente n = ");
        Integer n = in.nextInt();
        int a=0;
        int b=1;
        int c=0;
        System.out.print( a +" "+ b + " ");
        do{
            c = a + b;
            a = b;
            b = c;
            if (c <= n) {
                System.out.print(c + " ");
            }
        }while(c<=n);
        }
    }

