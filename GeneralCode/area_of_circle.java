import java.util.*;
public class area_of_circle {
    public static void main(String args[]) {
        float PI = 3.14f;
        Scanner sc  = new Scanner(System.in);

        System.out.println("Eneter the radius of a circle: ");
        float rad = sc.nextFloat();
        float area = PI * rad * rad;
        System.out.println("Area of Circle is "+area);
    }
}
