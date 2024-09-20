import java.io.*;
public class DataInputFloat {
    public static void main(String args[])
    {
        DataInputStream sc = new DataInputStream(System.in);

        try
        {
            System.out.println("Enter the float value: ");
            String str = sc.readLine();
            float y = Float.valueOf(str);
        }

        catch (Exception e)
        {
            System.out.println("An error occured: "+e.getMessage());
        }
    }
}
