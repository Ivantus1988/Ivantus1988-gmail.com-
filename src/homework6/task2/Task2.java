package homework6.task2;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        int[][] array = new int[9][9];
        for (int i = 0; i < array.length; i++) {
            for (int a = 0; a < array.length; a++) {
                array[i][a] = (i + 1) * (a + 1);
                System.out.print(array[i][a] + "\t");
            }
            System.out.println();
        }
        }
    }



