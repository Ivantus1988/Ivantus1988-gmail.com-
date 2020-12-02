package lesson5.task1;

public class Method {

    public static int arrayDays(int days, double startTemp, double tempDiff) {

        int[] arrayDays = new int[days];
        for (int i = 0; i < days - 1; i++) {
            if (i == 0) {
                arrayDays[i] = (int) (startTemp);
            } else {
                arrayDays[i] = arrayDays[i-1] + (int) (Math.random() * tempDiff);
            }
            System.out.print(arrayDays[i] + " ");
        }
        return days;
    }

}
