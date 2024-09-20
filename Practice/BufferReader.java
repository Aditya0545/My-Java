import java.io.*;

public class BufferReader {
    public static void main(String args[])
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try
        {
            System.out.println("Enter the value : ");
            String str = br.readLine();
            int x = Integer.parseInt(str);
            System.out.println("The value of x is "+x);
        }

        catch(IOException e)
        {
            System.out.println("An error occured with taking string: "+e.getMessage());
        }
        catch(NumberFormatException e)
        {
            System.out.println("Please enter a valid Input");
            return;
        }
    }
}
