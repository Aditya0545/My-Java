import java.util.*;


public class PelindromeCheck {

    public static void main(String args[]) {
        System.out.println("Enter the String: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String reversed = "";
        int lengthStr = str.length();

        for (int i = lengthStr-1; i >= 0; i--) {
            reversed = reversed + str.charAt(i);
        }
            if (str.equals(reversed)) {
                System.out.println("The string is a pelindrome"); 
            } else {
            System.out.println("Not pelindrome");
            }
    }
}