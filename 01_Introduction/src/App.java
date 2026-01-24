import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        //store some roll numbers
        int[] numbers = new int[5];
        //store 5 names
        String[] names = new String[5];

        // Data of 5 students : {roll no ,names and marks}
        int[] roll = new int[5];
        String[] name = new String[5];
        float[] marks = new float[5];

        // This is where oop comes into pic. A class is a named group of properties and functions
        Student[] students = new Student[5];

        //This is referencing a object of type student 
        // Student masir;
        // masir = new Student();

        Student masir = new Student(12,"masir", 9.92f);

        // masir.name = "masir";
        // masir.roll_number = 12;
        // masir.marks = 9.92f;

        System.out.println(masir);
        System.out.println(masir.roll_number);
        System.out.println(masir.name); // objs have null as default while primitives have values accordingly
        System.out.println(masir.marks);

        System.out.println(Arrays.toString(students));

        // new keyword dynamically allot memory and returns a ref to it 

        // constructor is special function that runs when you create an object and it allocates some variables .
        // Student masir = new Student(); // Default constructor
        masir.greeting();
        masir.changeName("Masir Jafri");
        masir.greeting();

        Student random = new Student(); // we applied the constructor overloading
        random.greeting();
        
        Student random2 = new Student(masir);
        random2.greeting(); // Has got the same rno name and marks as obj masir

        Student one = new Student();
        Student two = one;

        System.out.println(two.name + " " + two.marks + " " + two.roll_number);
        
        one.name = "random guy";
        System.out.println(two.name);
    }
}

//creating a class 
class Student {    
    int roll_number;
    String name;
    float marks;

    // we need a way to add the values of the above
    // properties object by object

    // we need one word to access every object 
    //It is done by "this" keyword
    Student(int roll, String name, float marks) {
        this.roll_number = roll;
        this.name = name;
        this.marks = marks;
    }

    Student() {
        this.roll_number = 0;
        this.name = "random";
        this.marks = 0f;
    }
    
    Student(Student other) {
        this.name = other.name;
        this.roll_number = other.roll_number;
        this.marks = other.marks;
    }

    // Student() {
    //     // this way you can also call constructor using another constructor 
    //     this (0, "random", 0f);
    // }

    void changeName(String name) {
        this.name = name;     
    }
    
    void greeting() {
        System.out.println("Hello my name is " + this.name);
    }
}
