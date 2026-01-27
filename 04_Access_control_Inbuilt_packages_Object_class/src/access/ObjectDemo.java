package access;

public class ObjectDemo {
    int num;
    float gpa;

    public ObjectDemo(int num, float gpa) {
        this.num = num;
        this.gpa = gpa;
    }
    
    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return this.num == ((ObjectDemo)obj).num;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    // @Override
    // protected void finalize() throws Throwable {
    //     super.finalize();
    // }

    public static void main(String[] args) {
        ObjectDemo obj = new ObjectDemo(100,45.32f);
        ObjectDemo obj2 = obj;
        System.out.println(obj.hashCode());
        System.out.println(obj2.hashCode());

        ObjectDemo obj3 = new ObjectDemo(100, 32.32f);
        
        if (obj == obj3) { // It checks whether both references point to the same object or not
            System.out.println("Obj is equal to obj3");
        }

        if (obj.equals(obj3)) { // It checks whether both objects values are the same or not
            System.out.println("Obj is equal to obj3");
        }

        System.out.println(obj3.getClass()); // It returns the class of the object
    }
}
