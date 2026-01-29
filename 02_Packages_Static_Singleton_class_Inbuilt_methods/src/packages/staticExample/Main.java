package packages.staticExample;

public class Main {
    public static void main(String[] args) {
        Human masir = new Human(19, "masir", 100000, false);
        Human random = new Human(20, "random", 10000, true);

        // System.out.println(masir.population);
        // System.out.println(random.population); // Static varibles should be accessed using the class name 
        System.out.println(Human.population);

        Human unnamed = new Human(25, "unnamed", 10090, false);
        System.out.println(masir.name + " " + random.name + " " + unnamed.name);
        System.out.println(Human.population);

        // This cannot be used since static methods can only access static data
        // greeting();
        fun();
    }

    static void fun() {
        // you cannot use this because it requires an instance but the function you are using it in does not depend on the instance 
        // greeting(); 

        System.out.println("This is the fun function");
        
        // you cannot access non static stuff without referencing their instances in a static content
        // Hence we can do this
        Main obj = new Main();
        obj.greeting();
    }
    
    // we know that something which is not static,belongs to an object 
    void greeting() {
        System.out.println("Hey how are you");
    }
}
