package lesson5.task4;

public class Methods{


    public static String array(int b) {
        String[] array =new String[6];
        for (int i = 0; i < array.length; i++) {
            if (array[i].length() > b) {
                array[i] = array[i];
            } else {
                array[i] = "";
            }
            System.out.print(array[i] + "  ");
        }

        String o = null;
        return o;
    }
}

