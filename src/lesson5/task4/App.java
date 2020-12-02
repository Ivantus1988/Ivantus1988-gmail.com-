package lesson5.task4;

import lesson5.task1.Method;

import static lesson5.task4.Methods.array;

public class App {
    public static void main(String[] args) {
        String[] array = new String[]{"Kate", "Olga", " Valera", "Sergei", "Innokentii", "Gendos" };
        int b = 4;
       Methods method = new Methods();
        String results;
        results = array(b);
        System.out.print(results);

        }
    }
