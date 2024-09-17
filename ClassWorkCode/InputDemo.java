import java.io.*;

public class InputDemo {
    public static void main(String args[]) {
        DataInputStream sc = new DataInputStream(System.in);
        int x = 0; // Declare x before the try block
        try {
            System.out.println("Enter the integer value: ");
            String str = sc.readLine();
            x = Integer.parseInt(str);
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
        System.out.println("The integer value = " + x);
    }
}


// Program 5