public class ThrowsDemo {

    static void Throwone() throws IllegalAccessException {
        System.out.println("Inside Throwone");
        throw new IllegalAccessException("demo");
    }

    public static void main(String[] args) {
        try {
            Throwone();
        } catch (IllegalAccessException e) {
            System.out.println("Exception caught: " + e);
        }
    }
}
