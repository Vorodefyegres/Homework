package Homework10;

public abstract class Vehicle {
    private String model;

    public Vehicle(String model) {
        this.model = model;
    }

    public abstract void start();

    public void stop() {
        System.out.println("Vehicle stopped");
    }
}