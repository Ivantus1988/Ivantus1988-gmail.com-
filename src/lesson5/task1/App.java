package lesson5.task1;

public class App {
    public static void main(String[] args) {
        int days = 5;
        double startTemp = 10;
        double tempDiff = 5;
        int [] arrayDays = new int[days];
        Method method = new Method();
        int result = method.arrayDays(days);
        System.out.print(result);

    }
}
