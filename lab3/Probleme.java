package lab3;

public class Probleme {
    public static void main (String[] args){
        problema1();
    }
    private static void problema1(){
        String cuvant="message";
        for( int i = cuvant.length()-1 ; i>=0; i--){
            System.out.println(cuvant.charAt(i));
        }
    }
}
