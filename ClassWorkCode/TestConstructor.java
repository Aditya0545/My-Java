class OverloadConstruct {
    int length, breadth;

    public OverloadConstruct() {
        length = breadth = 0;
    }

    public OverloadConstruct(int a) {
        length = breadth = a;
    }

    public OverloadConstruct(int l, int b) {
        length = l;
        breadth = b;
    }

    int area() {
        return length * breadth;
    }
}


public class TestConstructor {
    public static void main(String[] args) {
        OverloadConstruct obj1 = new OverloadConstruct();
        OverloadConstruct obj2 = new OverloadConstruct(10);
        OverloadConstruct obj3 = new OverloadConstruct(10, 20);

        int A1 = obj1.area();
        int A2 = obj2.area();
        int A3 = obj3.area();

        System.out.println("Area1"+A1);
        System.out.println("Area2"+A2);
        System.out.println("Area3"+A3);
    }
}
