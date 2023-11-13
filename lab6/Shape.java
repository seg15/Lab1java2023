package lab6;

public abstract class Shape {
     protected Integer l;

    public Shape(Integer l) {
        this.l = l;
    }

    public abstract Double area();
    public abstract Integer perimeter();

    public void desen(){
        System.out.println("Area of shape " + area());
        System.out.println("Perimeter shape " + perimeter());
    }

    public void desen(String culoare){
        System.out.println("Area of shape " + area());
        System.out.println("Perimeter shape " + perimeter());
        System.out.println("Color shape " + culoare);
    }

    public static void afiseazaCeva() {
        System.out.println("Ceva");
    }

}
