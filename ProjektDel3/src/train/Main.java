package train;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    //en lista som spara alla tickets
    static ArrayList<Ticket> tickets = new ArrayList<>();

    public static void main (String[] args) {

        while (true) {

            Scanner scan = new Scanner(System.in);

            System.out.print("Sell ticket enter 1, print names enter 2: ");

            int input = scan.nextInt();

            if (input == 1) {
               Ticket.sellTicket();
            }
            else if (input==2){
                System.out.println("\n" + "**********LIST OF PASSENGERS**********");
                Costumer.printNames(tickets);
            }
            else{
                System.out.println("Sorry, it's not a correct selection.Try again!");
            }
        }
    }
}
