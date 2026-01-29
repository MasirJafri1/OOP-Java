package interfaces;

public class Car implements Engine,Media,Brake {
    @Override
    public void start() {
        System.out.println("Car engine started");
    }

    @Override
    public void stop() {
        System.out.println("Car engine stopped");
    }

    @Override
    public void play() {
        System.out.println("Media playing");
    }

    @Override
    public void pause() {
        System.out.println("Media paused");
    }

    @Override
    public void brake() {
        System.out.println("Car braking");
    }
    
}
