class First1
{
    int a;
    public First1(int a)
    {
        this.a = a;
    }
}

class Second1 extends First1
{
    int b;
    public Second1(int x, int y)
    {
        super(x);
        b = y;
    }
    int add()
    {
        return a + b;
    }
}

class Third1 extends First1
{
    int c;
    public Third1(int x, int z)
    {
        super(x);
        c = z;
    }
    int mul()
    {
        return (a*c);
    }
}


// Main Class
public class HieraricalInheritance
{
    public static void main(String args[])
    {
        Second1 obj1 = new Second1(10, 20);
        Third1 obj2 = new Third1(30, 30);

        int sum = obj1.add();
        int mul = obj2.mul();

        System.out.println("Addition =  " + sum);
        System.out.println("Multiplication = " + mul);
    }
}