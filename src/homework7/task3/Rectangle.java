package homework7.task3;

public class Rectangle extends  Figure {
    private int side1;
    private int side2;

    public Rectangle(int side1, int side2) {
        this.side1 = side1;
        this.side2 = side2;
    }

    @Override
    public void square() {
        super.square();
        System.out.println("Площадь прямоугольника равна: " + side1*side2);
    }

    @Override
    void perimetr() {
        super.perimetr();
        System.out.println("Периметр прямоугольника равен: " + 2*(side2+side1));
    }
}
