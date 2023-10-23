package lab3;

public class Probleme {
    public static void main(String[] args) {
        problema1();
        problema2();
    }

    private static void problema1() {
        String cuvant = "message";
        for (int i = cuvant.length() - 1; i >= 0; i--) {
            System.out.println(cuvant.charAt(i));
        }
    }

    private static void problema2() {
        String[] arr1 = {"java", "test", "university"};
        String[] arr2 = {"car", "university", "plane"};
        for(int i = 0; i<arr1.length; i++){
            {
                for( int j = 0; j<arr2.length; j++){
                    if(arr1[i].equals(arr2[j])) {
                        System.out.println(arr1[i]);
                    }

                }
            }
        }
    }

}