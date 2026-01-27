package access;

/*
    Check the image for better understanding of access modifiers 
*/

public class A {
    private int num;
    String name; //It is default access modifier and can be accessed only in the same package
    int[] arr;
    protected int n =100;

    public int getNum() {
        return this.num;
    }

    public void setNum(int n) {
        this.num = n;
    }

    public A (int num, String name) {
        this.num = num;
        this.name = name;
        this.arr = new int[num];
    }
}
