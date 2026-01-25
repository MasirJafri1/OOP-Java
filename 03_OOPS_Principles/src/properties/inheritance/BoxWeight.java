package properties.inheritance;

public class BoxWeight extends Box{
    double weight;

    BoxWeight() {
        this.weight = -1;
    }

    BoxWeight(double l, double h, double w, double weight) {
        super(l, w, h); // Calling the parent class constructor
        // when you want to initialise the values present in the parent class 
        this.weight = weight;

        System.out.println(super.width); // used to access the member variables of parent class
        // Although we can use the parent class variables using this keyword then why we should access them using super keyword?

        // The reason is suppose there is same variable name present in both parent and child class, then how will you differentiate between them ? And hence the members of current class should be used using this keyword and that of parent class using super keyword 
    }
    
    BoxWeight(BoxWeight other) {
        super(other); // this is also possible
        weight = other.weight;
    }

    BoxWeight(double side,double weight) {
        super(side);
        this.weight = weight;
    }
}
