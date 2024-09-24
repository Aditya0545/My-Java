import java.util.*;
public class Factorial {

    public static void main(String args[]) {
        int i, num;
        int fact = 1;

        System.out.println("Enter the value: ");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();

        for(i = num; i > 0; i--){
            fact = fact * i;
        }
        System.out.println("Factorial of "+num+ "= "+fact);
    }
}