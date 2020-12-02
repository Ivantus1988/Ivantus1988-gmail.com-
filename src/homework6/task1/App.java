package homework6.task1;

public class App {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        double result = Calculator.sum(2.5, 3.5);
        double result1 = Calculator.subtract(2.5, 3.5);
        double result2 = Calculator.multiply(2.5, 3.5);
        double result3 = Calculator.divide(2.5, 2.5);
    }
}
