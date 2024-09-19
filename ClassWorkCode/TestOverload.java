class OverloadArea {
    // Method to calculate the area of a circle (using float for radius)
    float area(float r) {
        return (3.14f * r * r); // Use 'f' for float literals
    }

    // Method to calculate the area of a square
    int area(int a) {
        return (a * a);
    }

    // Method to calculate the area of a rectangle
    int area(int l, int b) {
        return (l * b);
    }
}

class TestOverload {
    public static void main(String[] args) {
        OverloadArea obj = new OverloadArea();

        // Use float for the circle area calculation
        float C = obj.area(3.0f);  // Pass float for circle radius
        int S = obj.area(4);       // Square area
        int R = obj.area(30, 40);  // Rectangle area

        System.out.println("Area of Circle: " + C);
        System.out.println("Area of Square: " + S);
        System.out.println("Area of Rectangle: " + R);
    }
}
