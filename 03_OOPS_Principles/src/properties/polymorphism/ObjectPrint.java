package properties.polymorphism;

public class ObjectPrint {
    int num;

    ObjectPrint(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "Object " +this.num ;
    }

    public static void main(String[] args) {
        ObjectPrint obj = new ObjectPrint(100);
        System.out.println(obj); // It will use the object class to print this if we do not override to string method and if we do, it will print that particular string
    }
}
