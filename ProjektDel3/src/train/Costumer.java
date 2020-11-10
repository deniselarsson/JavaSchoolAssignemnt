package train;

import java.util.ArrayList;
import java.util.Scanner;

//När man skapa en instans av costumer så ska parametrar name och age anges
public class Costumer {

    private String name;
    private int age;

    Costumer (String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName () {
        return this.name;
    }

    public int getAge () {
        return age;
    }

    ///Metod create customer
    public static Costumer createCustomer () {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter customers name: ");
        String name = scan.nextLine();

        System.out.print("Enter customers age: ");
        int age = scan.nextInt();

        //skapa en instans av costumer
        Costumer costumer = new Costumer(name, age);
        return costumer;

    }
    //(Parameter som håller en arraylist) många tickets
    //Loopen som skriver ut namn från listan
    public static void printNames (ArrayList<Ticket> tickets) {

        //(dataType variabel : array || collection
        //it stores the element in the variabel and executes the body each time
        for (Ticket ticket : tickets) {

            //ticket har en costumer och i sin tur har en namn
            System.out.println(ticket.costumer.getName()+ "\n");
        }
    }
}
