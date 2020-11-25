package by.task2;

public class Car {
    String mark;
    int ageOfPruduction;
    Color color;
    double volume;
    int mileage;

    public Car(String mark, int ageOfPruduction, Color color, double volume, int mileage) {
        this.mark = mark;
        this.ageOfPruduction = ageOfPruduction;
        this.color = color;
        this.volume = volume;
        this.mileage = mileage;
    }

    public void go(){
        System.out.println(mark + " is going.");
    }

    public void stop(){
        System.out.println(mark + " is stoped.");

    }
}
