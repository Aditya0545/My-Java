import java.io.*;
public class DataInputInt {
    public static void main(String args[])
    {
        DataInputStream sc = new DataInputStream(System.in);
        int x = 0;
        
        try
        {
            System.out.println("Enter the value of x: ");
            String str = sc.readLine();
            x = Integer.parseInt(str);
        }

        catch (Exception e)
        {
            System.out.println("An error occured: "+e.getMessage());
        }
    }
}
