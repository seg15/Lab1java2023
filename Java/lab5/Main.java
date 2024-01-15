package lab5;

public class Main {
    public static void main(String[] args){
        Cat firstcat = new Cat("Tom","gray",5);

        System.out.println("Cat name " + firstcat.getName());
        System.out.println("Cat color " + firstcat.getColour());
        System.out.println("Cat age " + firstcat.getAge());

        firstcat.play();
        firstcat.feed();
        firstcat.sleep();

    }

}
