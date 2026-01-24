package packages.staticExample;

public class Human {
    int age;
    String name;
    int salary;
    boolean isMarried;
    static long population;

    Human(int age, String name, int salary, boolean isMarried) {
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.isMarried = isMarried;
        // Static variables should not be used with the this keyword
        Human.population += 1;
    }
    
    static void humanMessage() {
        System.out.println("This is the humann message");
        // this cant be used in a static method
        // System.out.println(this.name);
    }
}
