package access;

public class Main {
    public static void main(String[] args) {
        A obj = new A(10, "masir");
        //need to do a few things
        // 1. Access the data members
        // 2. Modify the data members 

        // ArrayList<Integer> list = new ArrayList<>(20);
        // list.DEFAULT_CAPACITY = 100; // This cannot be done since it is private
        // obj.num //cannot access 
        // instead we can access this using getters and setters 
        System.out.println(obj.getNum());

        System.out.println(obj.n);

    }
}
