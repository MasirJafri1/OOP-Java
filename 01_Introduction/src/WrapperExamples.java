public class WrapperExamples {
    public static void main(String[] args) {
        int a = 10; // simple primitive
        int b = 20;

        Integer num = 45; // you will get too many methods to use by using it as an object

        // swap(a, b); //It will not swap since it is not pass by reference and is passed by value
        System.out.println(a+" "+b); 
        
        Integer x = 10;
        Integer y = 20;
        
        // swap(x, y); // It wil still not swap since the Integer is final class
        System.out.println(x + " " + y);
        
        final A masir = new A("masir");
        A stduent = new A("random student");

        // when a non primitive have final you cannot reassign it 
        masir.name = "Masir Jafri"; // This I can do change even if there is final
        // masir = stduent; // But this is not valid with the final

        A obj;
        for (int i = 0; i < 10000000; i++) {
            obj = new A("obj " + i);
        }
    }

    void swap(Integer a, Integer b) {
        int temp = a;
        a = b;
        b = temp;
    }
}

class A {
    // final is the keyword which is used to prevent it from modifying
    // final int NUM; //final variables need to be initialised
    final int NUMS = 12;

    String name;

    public A(String name) {
        this.name = name;
    }

    // you cant do manual garbage collection in java but you can ask java to do somethng when garbage collection happens
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object is being garbage collected: " + this.name);
    }
}