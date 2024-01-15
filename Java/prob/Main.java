package prob;

import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {


        Employee e = new Employee();

        Scanner input = new Scanner(System.in);


        System.out.println("Employee name ");
        e.setEmail(input.nextLine());
        System.out.println("Employee email ");
        e.setEmail(input.nextLine());
        System.out.println("Employee huorRate ");
        e.setHourRate(input.nextInt());
        System.out.println("Employee capacity ");
        e.setCapacity(input.nextInt());
        System.out.println("Employee freeDays ");
        e.setFreeDays(input.nextInt());

        e.MonthlyIncome();
    }
}
