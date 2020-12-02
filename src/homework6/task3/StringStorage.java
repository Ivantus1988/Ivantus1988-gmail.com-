package homework6.task3;

public class StringStorage {
    public static String[] changeOrder(String [] array ,int a, int b) {
        String x, y;
        for (int i = 0; i < array.length; i++) {
            String t = array[a];
            array[a] = array[b];
            array[b] = t;
            System.out.print(array[i] + "\t");
        }
        return array;
    }
}
