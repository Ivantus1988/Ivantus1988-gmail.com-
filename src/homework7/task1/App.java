package homework7.task1;

public class App {
    public static void main(String[] args) {
        Book book = new Book("Voina i mir", 2000, new Autor("Lev", "Tolsoti", 192), "roman");
        Book book1 = new Book("N", 1, new Autor("", "", 1), "roman");
        System.out.println(book.toString());
        System.out.println(book1.toString());
    }
}
