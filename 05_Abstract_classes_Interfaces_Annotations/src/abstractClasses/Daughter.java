package abstractClasses;

public class Daughter extends Parent { // Multiple inheritance is not still allowed, ie you cannot inherit two abstract classes
    public Daughter(int age) {
        super(age);
    }
    @Override
    void career(String name) {
        System.out.println("Daughter: I wanna become a "+name);
    }
    @Override
    void game(String name, int price) {
        System.out.println("Daughter: I like this "+name+" and its price is "+price);
    }
}
