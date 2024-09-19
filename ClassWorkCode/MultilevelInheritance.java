// Program -->

class First
{
    protected int a;
    public First(int a)
    {
        this.a = a;
    }
}

class Second extends First
{
    int b;
    public Second(int x, int y)
    {
        super(x);
        b = y;
    }
}

class Third extends Second
{
    int c;
    public Third(int x, int y, int z)
    {
        super(x,y);
        c = z;
    }
    int Volume()
    {
        return (a*b*c);
    }
}

public class MultilevelInheritance
{
    public static void main(String args[])
    {
        Third obj = new Third(10,20,30);
        int V = obj.Volume();
        System.out.println("Volume = "+V);
    }
}
