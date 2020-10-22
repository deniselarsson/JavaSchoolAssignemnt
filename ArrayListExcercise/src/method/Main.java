package method;

import java.util.ArrayList;

public class Main {

    public static void main (String[] args) {

        ArrayList();

    }
    /*
      Skriv en metod som skapar en arrayList, fyller en arrayList och returnerar en arrayList.
      ArrayListenska lagras i en variabel i samband med metodanropet.
      Variabeln ska skrivas ut i sout i konsollen.
       */
    public static void ArrayList () {

        ArrayList<String> names = new ArrayList<>();

        names.add("Sara");
        names.add("Calle");
        names.add("Johan");
        names.add("Jonas");

        System.out.println(names);
    }
}



