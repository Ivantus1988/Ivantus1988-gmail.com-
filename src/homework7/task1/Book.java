package homework7.task1;

public class Book {
    private String name;
    private int quantityOfPages;
    private  Autor autor;
    private String format;

    public Book(String name, int quantityOfPages, Autor autor, String format) {
        if (name.length()<2){
            this.name = "Azbuka";
        }
        else {
        this.name = name;}
        if (quantityOfPages <2){
           this.quantityOfPages = 20000;
        }
        else{
    this.quantityOfPages = quantityOfPages;}
        this.autor = autor;
        this.format = format;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", quantityOfPages=" + quantityOfPages +
                ", autor=" + autor +
                ", format='" + format + '\'' +
                '}';
    }
}


