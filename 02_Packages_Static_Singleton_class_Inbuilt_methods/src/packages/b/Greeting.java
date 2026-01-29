package packages.b;
import static packages.b.Message.message;

public class Greeting {
    public static void main(String[] args) {
        System.out.println("This is another package");
        System.out.println("Now the concern of the name conflict has been gone");
        message();
    }    
}
