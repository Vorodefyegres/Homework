package Homework9;

public class Outer {
    private int number;

    public static void main(String[] args) {
        Outer outerObject = new Outer(5);
        Inner innerObject = outerObject.new Inner();

        System.out.println("Начальное значение: " + outerObject.getNumber());

        innerObject.incrementAndPrint();
    }
    public Outer(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public class Inner {
        public void incrementAndPrint() {
            number++;
            System.out.println("Значение после вызова Inner: " + number);
        }
    }
}