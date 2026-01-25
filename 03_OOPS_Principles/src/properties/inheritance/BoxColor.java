package properties.inheritance;

public class BoxColor extends BoxWeight {
    String color = "white";

    BoxColor() {
        super();
    }

    BoxColor(BoxColor other) {
        super(other);
        this.color = other.color;
    }

    BoxColor(double l, double w, double h, double weight, String color) {
        super(l, h, w, weight);
        this.color = color;
    }

    BoxColor(double side, double weight, String color) {
        super(side, weight);
        this.color = color;
    }

    public void printBoxPriceDetails() {
        System.out.println("length: "+this.length+" width: "+this.width+" height: "+this.height+" weight: "+this.weight+" color: "+this.color);
    }
}
