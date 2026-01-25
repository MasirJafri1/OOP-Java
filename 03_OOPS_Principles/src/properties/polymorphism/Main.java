package properties.polymorphism;

public class Main {
    public static void main(String[] args) {
        Shapes shape = new Shapes();
        Circle circle = new Circle();
        Square square = new Square();

        shape.area();
        circle.area();
        square.area();

        Shapes triangle = new Triangle(); // method overriding
        triangle.area();
        
        Shapes.greeting();

        // Overriding depends on object and static stuffs do not depend on objects so overriding the static methods is not possible
        // Triangle tri = new Triangle();
        Triangle.greeting();
    }
}
