class tryCatch {
    public static void main(String args[]) {
        int d, a;
        try {
            a = 0; // Initialize variable a to 0
            d = 42 / a; // This will throw an ArithmeticException
            System.out.println("This will not be printed");
        } catch (ArithmeticException e) {
            // Catch and handle the ArithmeticException
            System.out.println("Divide by zero: " + e);
        }
        // This line will execute after the exception is handled
        System.out.println("After try-catch");
    }
}
