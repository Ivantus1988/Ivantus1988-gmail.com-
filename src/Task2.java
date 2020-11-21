public class Task2 {
    public static void main(String[] args) {
        int inStart;
        inStart=5;
        int [][] array = new int[3][];
        for(int i=0; i<array.length; i++) {
            array[i] = new int[i + 1];
        }
        for (int i=0; i<array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                inStart+=inStart;
                array[i][j] =inStart/2;
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        int inStart2 = 5;
        for(int i=0; i<array.length; i++) {
            array[i] = new int[i + 1];
        }
    }
}
