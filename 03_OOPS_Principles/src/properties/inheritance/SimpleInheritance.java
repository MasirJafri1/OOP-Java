package properties.inheritance;
public class SimpleInheritance {
    public static void main(String[] args) {
        Box box = new Box();
        System.out.println(box.length+" "+box.width+" "+box.height);

        Box box1 = new Box(9,8,7);
        System.out.println(box1.length + " " + box1.width + " " + box1.height);
        
        Box box2 = new Box(box1);
        System.out.println(box2.length + " " + box2.width + " " + box2.height);

        BoxWeight box3 = new BoxWeight();
        System.out.println(box3.height + " " + box3.weight + " " + box3.length);

        // we can access all the variables from both child class and parent class (if they are not private) 
        BoxWeight box4 = new BoxWeight(1, 2, 3, 4);
        System.out.println(box4.length);

        Box box5 = new BoxWeight(2,3,4,5); // initialising BoxWeight with Box type reference variable
        System.out.println(box5.width); // This can be accessed 
        // System.out.println(box5.weight); // This cannot be accessed using the reference Box class

        // there are many variables in both parent and child classes
        // You are given access to variables which are in the ref type ie BoxWeight 
        // hence you should have access to weight variable 
        // this also means that the ones you are trying to access should be initialise 
        // but here when the object itself is of type parent class , We cannot call the constructor of child class 

        // BoxWeight box6 = new Box(1, 2, 3);

    }
}
