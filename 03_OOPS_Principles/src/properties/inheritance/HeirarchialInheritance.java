package properties.inheritance;
public class HeirarchialInheritance {
    public static void main(String[] args) {
        BoxPrice box = new BoxPrice();
        box.printBoxPriceDetails();

        BoxPrice box1 = new BoxPrice(7, 5, 1000);
        box1.printBoxPriceDetails();
        
        BoxColor box0 = new BoxColor();
        box0.printBoxPriceDetails();

        BoxColor box2 = new BoxColor(7, 5, "red");
        box2.printBoxPriceDetails();
    }
}
