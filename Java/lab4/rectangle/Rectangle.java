package lab4.rectangle;

public class Rectangle {
    private Integer width;
    private Integer length;

    public Rectangle(Integer width, Integer length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle() {
    }

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    public void arieperimetru(){
        int arie= width*length;
        System.out.println("Arie: " + arie);

        int perimetru= 2*(width+length);
        System.out.println("Perimetru: " + perimetru);
    }

}
