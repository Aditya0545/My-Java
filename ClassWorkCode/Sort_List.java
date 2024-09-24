public class Sort_List {
    public static void main(String args[]) {
        int list[] = {69, 81, 30, 18, 24, 9, 74, 63, 88};  

        System.out.println("List = ");
        int size = list.length;
        for (int i = 0; i < size; i++) {
            System.out.print(list[i] + " ");
        }

        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (list[i] < list[j]) {  
                    int temp = list[i];
                    list[i] = list[j];
                    list[j] = temp;
                }
            }
        }


        System.out.println("\nSorted List = ");
        for (int i = 0; i < size; i++) {
            System.out.print(list[i] + " ");
        }
    }
}
