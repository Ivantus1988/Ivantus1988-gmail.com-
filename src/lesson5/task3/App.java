package lesson5.task3;

public class App {
    public static void main(String[] args) {
        Order order1 = new Order("home", 20, 50);
        Order order2 = new Order("work", 100, 100);
        Order order3 = new Order("street", 5, 10);

        int sum=0;

        int [] order = new int[3];

        order[0]  = order1.getPrice();
        order[1] = order2.getPrice();
        order[2] = order3.getPrice();

        int [] kolvo = new int[3];
        kolvo[0] = order1.getKolvo();
        kolvo[1] = order2.getKolvo();
        kolvo[2] = order3.getKolvo();

        for (int i=0; i<order.length; i++){
            if (kolvo[i]<10){
                    order[i]=order[i];
            }
            else if(kolvo[i]<25)
                order[i]=(int)(order[i]*0.9);
            else order[i]=(int)(order[i]*0.8);
            sum += order[i];
            System.out.print(order[i] + "   ");
           }
        System.out.println();
        System.out.println("Общая сумма заказов равна:" + sum + ".");
        }
    }