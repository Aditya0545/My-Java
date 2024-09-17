import java.io.*;

public class InputDemoFloat {
    public static void main(String args[]) {
        DataInputStream sc = new DataInputStream(System.in);
        try {
            System.out.println("Enter the float value: ");
            String str = sc.readLine();
            float y = Float.valueOf(str); // Use Float.valueOf() and not float.valueOf()
            System.out.println("The float value = " + y);
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}

// Program 6