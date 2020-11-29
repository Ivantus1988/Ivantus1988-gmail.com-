package lesson5.task2;
import lesson5.task2.Player;

public class    App {
    public static void main(String[] args) {

        Player player = new Player(3, 4);
        player.getDistance();
        double proidennoeRasstoianie = player.distance();
        System.out.println(proidennoeRasstoianie);
        player.move(11, 10);
        player.getDistance();

    }
}
