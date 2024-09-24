public class MultiplicationTable {
    final static int rows = 20;
    final static int columns = 20;

    public static void main(String args[]) {
        int product[][] = new int[rows][columns];
        int i, j;
        System.out.println("Product Table = ");
        for(i = 10; i < rows; i++) {
            for(j = 10; j < columns; j++) {
                product[i][j] = i * j;
                System.out.print(" "+product[i][j]);
            }
            System.out.println(" ");
        }
    }
}