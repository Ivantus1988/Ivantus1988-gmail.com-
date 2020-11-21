public class Task2 {
    public static void main(String[] args) {
        int n=3;
        int inStart = 5;
        int [][] array = new int[1][3];
        for (int i=0; i< array.length; i++) {
            for (int j = 0; j < array[i].length - 1; j++) {

                System.out.print(array[i][j]);
                System.out.println();
            }
        }
    }
}
