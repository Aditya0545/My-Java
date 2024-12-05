public class MultiCatchTest {

    public static void main(String[] args) {
        try {
            int a = args.length;
            System.out.println("a = "+a);
            int d = 42 / a;
            int c[] = {21,64};
            c[21] = 101;
        }
        catch(ArithmeticException e) {
            System.out.println("Divide by Zero" +e);
        }
        catch(ArrayIndexOutOfBoundsException f) {
            System.out.println("Array Index Boundary" +f);
        }
        System.out.println("After try catch block");
        
    }
}