package interfaces;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.start();
        car.play();
        car.pause();
        car.brake();
        car.stop();

        Engine e = new Car();
        e.start();        
    }
}