package properties.polymorphism;

public class Circle extends Shapes {
    // this will run when object of circle is created 
    // hence it is overriding the parent method 

    @Override // this is called annotation
    void area() {
        System.out.println("I am area of circle");
    }

    // @Override // This will show error since the below method is not overriding the parent method
    void areeaaa() {
        System.out.println("This is not overriding");
    }
}
