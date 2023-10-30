package lab4;

public class octombrielab {
    public static void main(String[] args) {
        pro("tractori");
    }

    public static void pro(String cuvant) {
        int lungime = cuvant.length();

        if(lungime%2==0){
            System.out.println(cuvant.charAt(lungime/2-1));
            System.out.println(cuvant.charAt(lungime/2));

        }
        else{
            System.out.println(cuvant.charAt(lungime/2));
        }
    }
}