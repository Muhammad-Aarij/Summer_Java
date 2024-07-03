
@FunctionalInterface
interface A{
    void show();
    // void a();
}

public class lamda_expression {

    public static void main(String[] args) {

        A obj = () -> {

            System.out.println("Hello World");
        };

        obj.show();
    }
    
}
