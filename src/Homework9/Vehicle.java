package Homework9;

public class Vehicle {
    private int speed;

    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.startEngine();
    }
    public Vehicle() {
        this.speed = 0;
    }

    public int getSpeed() {
        return speed;
    }

    public class Engine implements Runnable {
        @Override
        public void run() {
            for (int i = 0; i < 5; i++) {
                increaseSpeed();
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public void startEngine() {
        Engine engine = new Engine();
        Thread engineThread = new Thread(engine);
        engineThread.start();
    }

    private void increaseSpeed() {
        speed += 10;
        System.out.println("Текущая скорость: " + speed);
    }
}