package homework7.task1;

public class Autor {
    private String name;
    private String surname;
    private int age;

    public Autor(String name, String surname, int age) {
        if (name.length() < 2) {
           this.name = "Sigizmund";
        } else {
            this.name = name;
        }
        if (surname.length() < 1) {
           this.surname = "Sigizmundov";
        } else {
            this.surname = surname;}
            if (age < 2) {
                this.age = 2000;
            } else
                {
                this.age = age;
            }
        }


    @Override
    public String toString() {
        return "Autor{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }
}

