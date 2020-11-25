package by.task1;
import by.task1.as.Adress;
import by.task1.as.Building;
import by.task1.as.Lift;

public class App {
    public static void main(String[] args) {

        Building building1 = new Building("Jiloi",  10, Lift.YES, "Kirpich", 1985, new Adress("Chapaeva", 15));
        Building sklad = new Building("Sklad", 2, Lift.NO, "Derevo", 2000, new Adress("Dmitrieva",43) );
        Building home = new Building( "Home", 3, Lift.NO, "Blocks", 2015, new Adress("Kashtanovaia", 45));
        System.out.println(building1.kolvoEtajei);
        System.out.println(sklad.yearOfProduction);
        System.out.println(home.lift);
    }
}
