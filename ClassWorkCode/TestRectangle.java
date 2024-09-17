class Rectangle{
    int length, breadth;
    void getdata(int l, int b) {
    length = l;
    breadth = b; }
    int area() {
        int t = length * breadth;
        return(t);
    }
}

public class TestRectangle {    
    public static void main(String[] args) {
        int A1, A2;
        Rectangle obj1 = new Rectangle();
        Rectangle obj2 = new Rectangle();
        obj1.length = 10;
        obj1.breadth = 20;
        A1 = obj1.length * obj1.breadth;
        System.out.println("Area 1 is "+A1+"sq units");
        obj2.getdata(20, 20);
        A2 = obj2.area();
        System.out.println("Area 2 is "+A2+"sq units");
    }
}

// Prrogram 2