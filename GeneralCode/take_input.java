import java.util.*;

public class take_input {
    public static void main(String args[]) {
        System.out.println("Enter your Name: ");
        Scanner sc = new Scanner(System.in);
        // String name = sc.next();  capture upto next line or wide space
        String name = sc.nextLine();  // Use nextLine() to capture the full name
        System.out.println(name);
    }
}
