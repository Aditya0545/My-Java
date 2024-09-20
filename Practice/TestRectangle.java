class Rectangle
{
    int length, breadth;
    void getdata(int l, int b)
    {
        length = l;
        breadth = b;
    }
    int area()
    {
        int t = length * breadth;
        return t;
    }
}




public class TestRectangle {
    public static void main(String args[])
    {
        int A1, A2;
        Rectangle obj1 = new Rectangle();
        Rectangle obj2 = new Rectangle();

        obj1.length = 30;
        obj1.breadth = 40;
        A1 = obj1.length * obj1.breadth;

        obj2.getdata(10, 20);
        A2 = obj2.area();

        System.out.println("A1 = "+A1);
        System.out.println("A2 = "+A2);
    }
}
