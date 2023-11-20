package Lab7;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import java.util.stream.Collectors;

public class P1 {
    public static void main(String[] args){
      problema2_var2();
    }

    private static void problema1_var1(){
        int[] nr={2, 3, 4, 6, 7, 29, 40};
        int s=0;
        int l=0;
        for(int i=0; i<nr.length;i++){
            s=s+nr[i];
            l++;
        }
        int ma=s/l;
        System.out.println(ma);
    }

    private static void problema1_var2(){
        List<Integer> numereIntregi = Arrays.asList(3, 6, 8, 43, 65, 22, 76);

        AtomicReference<Integer> sum = new AtomicReference<>(0);
        numereIntregi.forEach(n -> {
            sum.set(sum.get() + n);
        });
        System.out.println(sum.get() / numereIntregi.size());
    }

    private static void problema1_var3(){
        List<Integer> numereIntregi = Arrays.asList(3, 6, 8, 43, 65, 22, 76);

        double v = numereIntregi.stream()
                .mapToDouble(i -> i.doubleValue())
                .average()
                .orElse(0.0);

          System.out.println(v);
    }

    private static void problema2_var1(){
        List<String>  list = Arrays.asList("mere", "pere", "morcovi");
        list.forEach(s -> {
            list.set(list.indexOf(s), s.toUpperCase());
                         // pozitia
        });
        System.out.println(list);
    }

    private static void problema2_var2() {
        List<String> list = Arrays.asList("mere", "pere", "morcovi");

        List<String> list2 = list.stream()
               .map(s -> s.toUpperCase())
                .collect(Collectors.toList());

       System.out.println(list2);
    }
}
