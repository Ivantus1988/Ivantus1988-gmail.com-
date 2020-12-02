package homework6.task2;

public class Task2 {
    public static void main(String[] args) {
        int a = 1;
        int b;
        while (a != 10) {
            for (int i = 1; i < 10; i++) {
                b = a * i;
                if (b == 1) System.out.print("    ");
                else {System.out.print(b + "\t");}
            }
            System.out.println();
            a++;
            }
        }
    }




