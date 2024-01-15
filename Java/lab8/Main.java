package lab8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        problema3();
    }
    public static void problema1(){
        List<Integer> nr = Arrays.asList(12, 5, 5, 53, 34, 43, 77, 69, 51, 51);
        List<Integer> duplicate = nr.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println("Lista introdusa fara duplicari: " + duplicate);
    }

    public static void problema2(){
        List<String> sir = Arrays.asList("Dragon", "Anvelopa", "Dora", "Exploratoare", "Coca");
        Scanner cin = new Scanner(System.in);
        System.out.println("Program  are  " + sir.size() + " siruri" );
        System.out.println("Introduceti o litera: ");
        String caracter = cin.nextLine();
        int counter = (int) sir.stream().filter(s -> s.startsWith(String.valueOf(caracter))).count();
        System.out.println(counter + " sirul incepe cu litera " + caracter);
    }

    public static void problema3 (){
        List<Integer> sort = Arrays.asList(7, 6, 87, 940, 69, 230);

        Collections.sort(sort);
        System.out.println("Ordonat asc: " + sort );
        Collections.sort(sort, Collections.reverseOrder());
        System.out.println("Ordonat des: " + sort);

    }
}
