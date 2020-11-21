public class Task1 {
    public static void main(String[] args) {
        int[] array = {10, 1, 9, 2, 8, 7, 3, 6, 4, 5};
        int sum = 0;
        int mediana=0;
        for (int i = 0; i < array.length; i++) {
            sum=sum+array[i];
            mediana=Math.abs(array[i]);
        }
        System.out.println("Сумма всех элементов массива равна: " + sum + ".");
        System.out.println("Среднее арифметическое элементов массива равно: " + sum / array.length + ".");
        System.out.println("Значение медианы равно: " + mediana + ".");
    }
}
