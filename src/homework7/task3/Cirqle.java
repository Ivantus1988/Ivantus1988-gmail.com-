package homework7.task3;

public class Cirqle extends Figure {
    private int radius;


    public Cirqle(int radius) {
        this.radius = radius;

    }

    @Override
    public void square() {
        super.square();
        System.out.println("Площадь круга равна: " +(int) (Math.PI * radius*radius));
    }

    @Override
    void perimetr() {
        super.perimetr();
        System.out.println("Периметр круга равен: " + (int) (Math.PI * 2 * radius));
    }
}
