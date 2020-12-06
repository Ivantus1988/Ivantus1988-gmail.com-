package homework7.task4;

import java.util.LinkedList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Person> persons = new LinkedList<>();
        persons.add(new Person("Piter"));
        persons.add(new Person("Sergey"));
        persons.add(new Person("Valerii"));
        persons.add(new Person("Andrei"));
        persons.add(new Person("Vladimir"));
        System.out.println(persons.size());
        System.out.println(persons);

        Person person = new Person("Piter");
        System.out.println(person);
        System.out.println(persons.toString().contains(person.toString()));
        System.out.println(persons.toString().indexOf(person.toString()));
    }
}
