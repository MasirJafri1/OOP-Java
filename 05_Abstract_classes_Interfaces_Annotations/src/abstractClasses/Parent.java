package abstractClasses;

public abstract class Parent { // We cant use final in the abstract classes since it prevent it to be inherited so there is no sense of using them both 
    int age;
    final int VALUE;

    public Parent(int age) {
        this.age = age;
        VALUE = 100;
    }

    // abstract Parent(){
    //     this.age = 100;
    // }

    static void hello() {
        System.out.println("Hello");
    }

    void normal() {
        System.out.println("This is a normal method");
    }

    abstract void career(String name);
    abstract void game(String name, int price);
}
