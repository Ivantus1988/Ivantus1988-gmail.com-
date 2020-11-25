package by.task2;

public class App {
    public static void main(String[] args) {
        Car car1 = new Car ( "Toyota" , 1999, Color.BLACK, 2.5, 358000);
        Car car2 = new Car("Renault", 2015, Color.WHITE, 1.8, 99856);
        Car car3 = new Car (" Citroen", 2010, Color.RED, 1.4, 258456);

        car3.go();
        car3.stop();
    }
}
