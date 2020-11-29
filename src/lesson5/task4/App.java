package lesson5.task4;

public class App {
    public static void main(String[] args) {
        String[] array = new String[]{"Kate", "Olga", " Valera", "Sergei", "Innokentii", "Gendos" };
        String[] array1= new String[array.length];
        int b = 4;
        for (int i = 0; i < array.length; i++) {
            if (array[i].length() > b) {
                array1[i] = array[i];}
                else{
                    array1[i] = "";
                }
            System.out.print(array1[i] + "  ");
            }
        }
    }
