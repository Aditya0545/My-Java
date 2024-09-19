class Rectangle3
{
    int length, breadth;
    Rectangle3(int l, int b)
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

class Cuboid extends Rectangle3
{
    int height;
    Cuboid(int x, int y, int z)
    {
        super(x,y);
        height = z;
    }

   int Volume()
   {
       return length*breadth*height;
   }
}
public class SingleInheritance
{
    public static void main(String args[])
    {
        Cuboid obj = new Cuboid(10,20,30);
        int A = obj.area();
        int V = obj.Volume();
        System.out.println("The volume of a cuboid is: " + V);
        System.out.println("The area of a cuboid is: " + A);
    }
}
