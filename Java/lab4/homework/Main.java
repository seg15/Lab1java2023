package lab4.homework;
import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
     Dog dog = new Dog();
        Scanner input = new Scanner(System.in);

        System.out.println("Enter dog name: ");
        dog.setName(input.nextLine());
        System.out.println("Enter dog breed: ");
        dog.setBreed(input.nextLine());
    }
}
