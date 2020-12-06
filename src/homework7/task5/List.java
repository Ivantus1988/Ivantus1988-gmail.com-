package homework7.task5;

import java.util.ArrayList;

public class List {
    public static void main(String[] args) {

       // String string = "My name is Ivan";
       // char[] stringArray = string.toCharArray();
       // ArrayList<Character> simvol = new ArrayList<Character>();
       // for (int i = 0; i < stringArray.length; i++) {
       //     simvol.add(stringArray[i]);
        //    }
      //  System.out.println(string.contains("a"));
      //  System.out.println(simvol.contains("a"));
        ArrayList <String> list = new ArrayList <String>();
        list.add("My");
        list.add("name");
        list.add("is");
        list.add("Ivan");
        System.out.println(list);

        System.out.println(list.contains("M"));
        System.out.println(list.contains("N"));
        System.out.println(list.contains("I"));
        System.out.println("My".contains("M"));

    }
}
