interface Area {
    final static float pi = 3.14f;
    float Compute();
}

interface Volume {
    float ComputeVolume();
}

class Shape implements Area, Volume {
    int r, h;

    // Constructor for circle (only radius)
    public Shape(int r) {
        this.r = r;
    }

    // Constructor for cylinder (radius and height)
    public Shape(int x, int y) {
        r = x;
        h = y;
    }

    // Compute area of circle
    public float Compute() {
        return(pi * r * r);
    }

    // Compute volume of cylinder
    public float ComputeVolume() {
        return(pi * r * r * h);
    }
}

public class TestMultipleInterface {
    public static void main(String[] args) {
        Shape obj = new Shape(10);  // For circle
        Shape obj1 = new Shape(10, 20);  // For cylinder

        float A = obj.Compute();
        float V = obj1.ComputeVolume();

        System.out.println("Area = " + A);
        System.out.println("Volume = " + V);
    }
}
