package properties.polymorphism;

public class Triangle extends Shapes {
    void area() {
        System.out.println("I am area of triangle");
    }

    // we cannot override a final method
    // void parent() { 
    //     System.out.println("This is the final method");
    // }

    static void greeting() { // overriding a static method is not possible since it is not object dependent
        System.out.println("Hey i am trying to override the Shape greeting");
    }
}
