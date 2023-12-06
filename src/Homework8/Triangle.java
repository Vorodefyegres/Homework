package Homework8;

public class Triangle {
    private int side1;
    private int side2;
    private int side3;
    public static void main(String[] args) {
        Triangle triangle = new Triangle(3, 4, 5);

        System.out.println("Perimeter: " + triangle.calculatePerimeter());
        System.out.println("Area: " + triangle.calculateArea());
    }
    public Triangle(int side1, int side2, int side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    public int calculatePerimeter() {
        return side1 + side2 + side3;
    }
    public int calculateArea() {
        int s = calculatePerimeter() / 2;
        return (int) Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }
}