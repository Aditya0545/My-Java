class Super
{
    int x;
    public Super(int x)
    {
        this.x  = x;
    }
    void display()
    {
        System.out.println("Super x = "+x);
    }
}

class Sub extends Super
{
    int y;
    public Sub(int x, int y)
    {
        super(x);
        this.y = y;
    }
    void display()
    {
        System.out.println("Sub x = "+y);
    }
}
class TestOverride
{
    public static void main(String args[])
    {
        Sub obj = new Sub(10, 20);
        obj.display();
    }
}
