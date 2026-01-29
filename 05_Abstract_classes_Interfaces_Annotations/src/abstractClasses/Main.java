package abstractClasses;

public class Main {
    public static void main(String[] args) {
        Son s = new Son(10);
        s.career("Engineer");
        System.out.println(s.age);
        
        Daughter d = new Daughter(20);
        d.career("Doctor");
        System.out.println(d.age);

        // Parent mom = new Parent(); // cant create an object of abstract class 
        Parent daughter = new Daughter(30);
        daughter.career("Artist");

        Parent.hello();
    }
}
