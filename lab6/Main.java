package lab6;

public class Main {
    public static void main(String[] args){
        Shape.afiseazaCeva();

        Triangle triangle = new Triangle(5);
        Square square = new Square(6);
        triangle.desen();
        square.desen();
    }
}
