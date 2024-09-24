class PatternWithLabelledLoop
{
    public static void main(String args[])
    {
        int i, j;
        loop1: for(i=1; i<=100; i++)
        {
            if(i>7)
            break;

            for(j=1; j<=i; j++)
            {
                System.out.print(j);
            }
            System.out.println("");
            if(j==i)
            continue loop1;
        }
    }
}