class Rectangle 
{
    int length, breadth;
Rectangle()
{
    // ....
}

Rectangle(int l, int b)
{
    length = l;
    breadth = b;
}

int area()
{
    return (length*breadth);
}


public class Const 
{
    public static void main(String args)
    {
        Rectangle obj1 = new Rectangle();
        Rectangle obj2 = new Rectangle(10, 20);

        int A1 = obj1.area();
        int A2 = obj2.area();

        System.out.println("A1: "+A1);
        System.out.println("A2: "+A2);
    }
}
}
