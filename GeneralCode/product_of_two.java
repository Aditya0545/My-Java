import java.util.*;
public class product_of_two {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of a and b: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int prod = a * b;
        System.out.println("Product is "+prod);
    }
}
