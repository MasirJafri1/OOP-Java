public class App {
    public static void main(String[] args) throws Exception {
        A obj = new A("random");
        System.out.println(obj);
        
    }
}

class A {
    String name;
    public A(String name) {
        this.name = name;
    }
}