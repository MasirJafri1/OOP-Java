package properties.inheritance;

public class Box {
    double length;
    double height;
    double width;

    Box() {
        this.height = -1;
        this.width = -1;
        this.length = 1;
    }

    // cube
    Box(double side) {
        super(); // all the classes inherit the object class by default
        this.length = side;
        this.width = side;
        this.height = side;
    }
    
    Box(double length,double width,double height){
        this.length = length;
        this.width = width;
        this.height = height;
    }

    Box(Box old) {
        this.height = old.height;
        this.length = old.length;
        this.width = old.width;
    }

    public void displayInformation() {
        System.out.println("height : "+this.height);
        System.out.println("width : "+this.width);
        System.out.println("length : "+this.length);
    }
}
