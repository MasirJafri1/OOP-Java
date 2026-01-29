package abstractClasses;

public class Son extends Parent { // Multiple inheritance is not still allowed, ie you cannot inherit two abstract classes
    public Son(int age) {
        super(age);
    }

    @Override
    void normal() {
        System.out.println("hello");
    }

    @Override
    void career(String name) {
        System.out.println("Son: I wanna become a "+name);
    }
    @Override
    void game(String name, int price) {
        System.out.println("Son: I like this "+name+" and its price is "+price);
    }
}
