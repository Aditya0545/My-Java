import java.util.*;
public class Calci {
    public static void main(String args[]) {
        /*Making small calculator */
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First number: ");
        float num1 = sc.nextFloat();
        System.out.println("\nEenter the second number: ");
        float num2 = sc.nextFloat();
        float add = num1 + num2;
        float sub = num1-num2;
        float mul = num1 * num2;
        float div = num1 / num2;
        float mod_div = num1 % num2;
        System.out.println("Sum of two numbers is "+add);
        System.out.println("Difference of two numbers is "+sub);
        System.out.println("Product of two numbers is "+mul);
        System.out.println("Quotient of two numbers is"+div);
        System.out.println("Remainder is "+mod_div);
    }
}
