package homework7.task2;

public class Person {
    public static void main(String[] args) {
        Pet[] pets = {
                new Dog(),
                new Kitten(),
                new Fish()
        };

        for (Pet p : pets)
            p.play();
        System.out.println();
        Dog dog = new Dog();
        Kitten kitten = new Kitten();
        Fish fish = new Fish();
        dog.play();
        kitten.play();
        fish.play();

    }
}
