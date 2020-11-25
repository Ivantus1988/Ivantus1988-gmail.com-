package by.task3;

public class ArraysCalculator {
    public static void main(String[] args) {

        int[] array1 = {1, 45, 56, -25, 343, -500, 0, 20, 45};
        int[] array2 = {2, 47, 1, 2};
        int biggerArray;
        int smallerArray;

        if (array1.length < array2.length) {
            biggerArray = array2.length;
            smallerArray = array1.length;
        } else {
            biggerArray = array1.length;
            smallerArray = array2.length;
        }

        int[] array3 = new int[biggerArray];

        for (int a = 0; a < biggerArray; a++) {
            if (smallerArray >= biggerArray) {
                array3[a] = array1[a] + array2[a];
            } else {
                array3[a] = array1[a];
                System.out.print(array3[a] + " ");
            }
        }
    }
}




