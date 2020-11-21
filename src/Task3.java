public class Task3 {
    public static void main(String[] args) {
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = 100 - i;
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.print("Элементы, которые делятся на 3 и на 7: ");
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 3 == 0 && array[i] % 7 == 0)
                System.out.print(array[i] + "  ");
        }
        System.out.println();
        System.out.print("Элементы, которые делятся на 5 или на 7, но не делятся на 35: ");
        for (int i = 0; i < array.length; i++) {
            if ((array[i] % 5 == 0 || array[i] % 7 == 0) && array[i] % 35 != 0)
                System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.print("Элементы, диапазонов [10; 19], [30; 39], [50; 59], [70; 79], [90; 99], которые делятся на 5 или на 7, но не делятся на 35: ");
        for (int i = 0; i < array.length; i++) {
            if ((((array[i] <= 19 && array[i] >= 10) || (array[i] <= 39 && array[i] >= 30) || (array[i] <= 59 && array[i] >= 50) || (array[i] <= 79 && array[i] >= 70) || (array[i] <= 99 && array[i] >= 90)) && (array[i] % 5 == 0 || array[i] % 7 == 0)) && (array[i] % 35 != 0))
                System.out.print(array[i] + " ");
        }
    }
}


