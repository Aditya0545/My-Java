import java.io.*;

class InputDemoBuffered {
    public static void main(String args[]) {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.print("Enter the integer value:");
            String str = sc.readLine(); // Correct method to read a line from input
            int x = Integer.parseInt(str); // Convert the input string to an integer
            System.out.println("The integer value = " + x);
        } catch (IOException e) {
            System.out.println("An error occurred while reading input.");
            e.printStackTrace(); // Print the stack trace for the IOException
        } catch (NumberFormatException e) {
            System.out.println("Please enter a valid integer."); // Handle incorrect number format
//            e.printStackTrace(); // Print the stack trace for NumberFormatException
        }
    }
}

// Program 7