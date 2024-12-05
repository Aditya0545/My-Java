public class SortCities {
    static String city[] = {"Madras", "Mumbai", "Chennai", "New Delhi", "Calcutta", "Bengaluru"};

    public static void main(String args[]) {
        int size = city.length;
        String temp = null;

        // Sorting logic (Bubble Sort)
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (city[i].compareTo(city[j]) > 0) {  // Sort in ascending order
                    temp = city[i];
                    city[i] = city[j];
                    city[j] = temp;
                }
            }
        }

        // Printing the sorted array
        for (int i = 0; i < size; i++) {
            System.out.println(city[i]);
        }
    }
}
