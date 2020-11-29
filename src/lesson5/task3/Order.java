package lesson5.task3;

public class Order {

private static int counter;

private String name;
private int kolvo;
private int price;

    public Order(String name, int kolvo, int price) {
        this.name = name;
        this.kolvo = kolvo;
        this.price = price;
    }
    public int getKolvo() {
        return kolvo;
    }

    public void setKolvo(int kolvo) {
        this.kolvo = kolvo;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

}
