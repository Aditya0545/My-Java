class Rectangle1 {
    int length, breadth;

    Rectangle1() {
    length = 0;
    breadth = 0;
    }

    Rectangle1(int l, int b) {
        length = l;
        breadth = b;
    }
    int area() {
        return(length * breadth);
    }
}

class TestRectangleConst {
    public static void main(String args[]) {
        Rectangle1 obj1 = new Rectangle1(5,4);
        Rectangle1 obj2 = new Rectangle1(2,2);

        int A1 = obj1.area();
        int A2 = obj2.area();

        System.out.println("Area:1 " + A1);
        System.out.println("Area2: " + A2);
    }
}