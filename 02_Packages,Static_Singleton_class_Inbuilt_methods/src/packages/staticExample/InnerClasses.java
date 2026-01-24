package packages.staticExample;

// only inner classes can be static and not the outermost class in case of classes inside class
public class InnerClasses {

    static class Test { // It is needed to be static for the main to call it directly
        String name;

        Test(String name) {
            this.name = name;
        }
        
        @Override
        public String toString() {
            return this.name;
        }
    }

    public static void main(String[] args) {
        Test a = new Test("Masir"); // It is ok only when it is static since if it is not static it will get depended on the obj of the outermost class
        Test b = new Test("Random");
        System.out.println(a.name);
        System.out.println(b.name);
        System.out.println(a);
    }
}
