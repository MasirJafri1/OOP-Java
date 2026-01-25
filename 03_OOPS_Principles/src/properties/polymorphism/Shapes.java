package properties.polymorphism;

public class Shapes {
    void area() {
        System.out.println("I am area of shape");
    }

    // Early Binding
    final void parent() {
        System.out.println("This is the final method");
    }

    static void greeting() {
        System.out.println("Hey I am in Shape class and greetings for you");
    }
}
