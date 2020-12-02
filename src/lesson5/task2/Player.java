package lesson5.task2;

public class Player {
    int x;
    int y;

    public Player(int x, int y) {
        this.x = x;
        this.y = y;
    }


    public double distance(){
        return Math.sqrt(x*x+y*y);
    }

    public void move(double dx, double dy){
        x+=dx;
        y+=dy;
    }

    public void getDistance(){
        System.out.println("x:" + x + ", y:" + y + ".");
    }

}



