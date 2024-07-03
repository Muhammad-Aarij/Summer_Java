class MyException extends Exception {
    public MyException(String message) {
        super(message);
    }
}

public class exceptionshandling {
    public static void main(String[] args) {
        
        int i = 1;
        String a = null;
        int cal;
        try {
            if (i == 0) {
                throw new MyException("Invalid denominator");
            }
            cal = 10 / i; // This line will never be reached if i is 0
            
            int res = a.length(); // This line will cause a NullPointerException
            
            if (a.length() == 0) {
                throw new NullPointerException("No letter"); // This line will never be reached if a is null
            }
        } catch (MyException e) {
            cal = 10 / 1;
            System.out.println("Custom Exception: " + e.getMessage());
        } catch (NullPointerException e) {
            System.out.println("Null Pointer Exception: " + e.getMessage());
        }

        System.out.println("After exception handling");
    }
}
