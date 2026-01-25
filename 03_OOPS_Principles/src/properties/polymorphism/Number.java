package properties.polymorphism;
public class Number {
    int sum(int a, int b) {
        return a + b;
    }

    int sum(int a, int b, int c) {
        return a + b + c;
    }

    double sum(double a ,int b){
        return a+b;
    }

    public static void main(String[] args) {
        Number obj = new Number();
        
        System.out.println(obj.sum(1, 2));
        System.out.println(obj.sum(1, 2, 4));
        System.out.println(obj.sum(1.1, 9));

    }
}
