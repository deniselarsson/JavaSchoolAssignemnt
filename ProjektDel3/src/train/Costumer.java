package train;

import java.util.ArrayList;
import java.util.Scanner;

//När man skapa en instans av Person så ska parametrar name och age anges
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

        //skapa en instans av person
        Costumer costumer = new Costumer(name, age);
        return costumer;

    }
    //(Parameter som håller en arraylist) många tickets
    //Loopen som skriver ut namn från listan
    public static void printNames (ArrayList<Ticket> tickets) {

        for (Ticket ticket : tickets) {
            System.out.println(ticket.costumer.getName()+ "\n");
        }
    }
}
