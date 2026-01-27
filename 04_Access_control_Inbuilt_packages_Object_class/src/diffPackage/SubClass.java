package diffPackage;
import access.A;

public class SubClass extends A {

    public SubClass(int num, String name) {
        super(num, name);
    }
    
    public static void main(String[] args) {
        SubClass obj = new SubClass(100, "masir");
        System.out.println(obj.n);
        // System.out.println(obj.num); // num is private in class A, so this will cause a compile-time error
        System.out.println(obj.getNum());
        // System.out.println(obj.name); // name has default access in class A, so this will cause a compile-time error
    }
}
