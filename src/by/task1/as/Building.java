package by.task1.as;

public class Building {
   public String naznachenie;
   public int kolvoEtajei;
   public Lift lift;
   public String materal;
   public int yearOfProduction;
   public Adress adress;


    public Building(String naznachenie, int kolvoEtajei, Lift lift, String materal, int yearOfProduction, Adress adress) {
        this.naznachenie = naznachenie;
        this.kolvoEtajei = kolvoEtajei;
        this.lift = lift;
        this.materal = materal;
        this.yearOfProduction = yearOfProduction;
        this.adress = adress;
    }

    public Building(String naznachenie, int kolvoEtajei) {
        this.naznachenie = naznachenie;
        this.kolvoEtajei = kolvoEtajei;
        this.lift = lift;
        this.materal = materal;
        this.yearOfProduction = yearOfProduction;
    }
}

