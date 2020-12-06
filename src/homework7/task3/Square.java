package homework7.task3;

public class Square extends Figure {
    private int side;


    public Square(int side) {
        this.side = side;

    }

    @Override
    public void square() {
        super.square();
        System.out.println("Площадь квадрата равна: " + side*side);
    }

    @Override
    void perimetr() {
        super.perimetr();
        System.out.println("Периметр квадрата равен: " + 4*side);

    }
}
