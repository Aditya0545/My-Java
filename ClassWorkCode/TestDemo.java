class Test {
    private int x;              // Instance variable
    private final int y = 5;     // Final instance variable initialized
    private static int a;        // Static variable
    private static final int z = 20;  // Static final variable initialized

    // Constructor to initialize 'x'
    Test(int x) {
        this.x = x;
    }

    // Method to return the product of x and y
    int temp() {
        return x * y;
    }
}

class TestDemo {
    public static void main(String args[]) {
        // Creating Test objects with different values for 'x'
        Test r1 = new Test(2);
        Test r2 = new Test(4);
        Test r3 = new Test(6);

        // Displaying the product of x and y for each object
        System.out.println("Product of x and y in r1: " + r1.temp());
        System.out.println("Product of x and y in r2: " + r2.temp());
        System.out.println("Product of x and y in r3: " + r3.temp());
    }
}
