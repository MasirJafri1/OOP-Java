package properties.inheritance;

public class BoxPrice extends BoxWeight {
    int cost;

    BoxPrice() {
        super();
        this.cost = 1000;
    }

    BoxPrice(BoxPrice other) {
        super(other);
        this.cost = other.cost;
    }

    BoxPrice(double l, double w, double h, double weight, int cost) {
        super(l, h, w, weight);
        this.cost = cost;
    }

    BoxPrice(double side, double weight, int cost) {
        super(side, weight);
        this.cost = cost;
    }

    public void printBoxPriceDetails() {
        System.out.println("length: "+this.length+" width: "+this.width+" height: "+this.height+" weight: "+this.weight+" cost: "+this.cost);
    }
}
