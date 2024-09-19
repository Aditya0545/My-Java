//package java.io.*;

class Test {
    private int x;              // Instance variable
    private final int y = 5;     // Final instance variable must be initialized
    private static int a;        // Static variable
    private static final int z = 20;  // Static final variable initialized

    // Method to return the product of x and y
    int temp() {
        return (x * y);
    }
}

class TestDemo {
    public static void main(String args[]) {
        Test r1 = new Test();
        Test r2 = new Test();
        Test r3 = new Test();
    }
}
