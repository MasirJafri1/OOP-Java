package properties.inheritance;

public class MultipleInheritance {
    public static void main(String[] args) {
        BoxPrice box = new BoxPrice();
        box.printBoxPriceDetails();

        BoxPrice box1 = new BoxPrice(7, 5, 1000);
        box1.printBoxPriceDetails();
    }
}
