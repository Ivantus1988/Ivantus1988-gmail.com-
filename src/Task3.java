public class Task3 {
    public static void main(String[] args) {
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = 100 - i;
            System.out.print(array[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 3 == 0 && array[i] % 7 == 0)
                System.out.print(array[i] + "  ");
        }
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            if ((array[i] % 5 == 0 || array[i] % 7 == 0) && array[i] % 35 != 0)
                System.out.print(array[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            if ((((array[i] <= 19 && array[i] >= 10) || (array[i] <= 39 && array[i] >= 30) || (array[i] <= 59 && array[i] >= 50) || (array[i] <= 79 && array[i] >= 70) || (array[i] <= 99 && array[i] >= 90)) && (array[i] % 5 == 0 || array[i] % 7 == 0)) && (array[i] % 35 != 0))
                System.out.print(array[i] + " ");
        }
    }
}


