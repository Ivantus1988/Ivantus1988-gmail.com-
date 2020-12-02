package homework6.task1;

public class Calculator {

    public static double sum(double a, double b){
        double result = a+b;
        System.out.println("Сумма равна: " + result);
        return result;
    }

    public static double subtract(double a, double b){
        double result = a-b;
        System.out.println("Разность равна: " + result);
        return result;
    }

    public static double multiply(double a, double b){
        double result = a*b;
        System.out.println("Приозведение равно: " + result);
        return result;
    }

    public static double divide(double a, double b){
        double result = a/b;
        System.out.println("Частное равно: " + result);
        return result;
    }



}
