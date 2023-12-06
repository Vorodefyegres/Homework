package Homework8;

public class Rectangle {
    private int length;
    private int width;
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(5, 9);
        Rectangle rectangle2 = new Rectangle(10, 14);

        System.out.println("Area of Homework8.Rectangle 1: " + rectangle1.returnArea());
        System.out.println("Area of Homework8.Rectangle 2: " + rectangle2.returnArea());
    }
    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }
    public int returnArea() {
        return length * width;
    }
}