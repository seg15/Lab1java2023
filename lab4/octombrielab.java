package lab4;

public class octombrielab {
    public static void main(String[] args) {
       Person person = new Person();
       Profesor profesor = new Profesor();
       Student student = new Student();

       person.setAge(10);
        person.setName("Mihai");
       person.setEmail("ceva@yahoo.ro");
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

    public static void doi(int nr){
        while(nr>0){
            System.out.println(nr%10);
            nr/=10;

        }
    }
}