package train;

import java.util.Scanner;
import static train.Main.tickets;
import static train.Costumer.createCustomer;

public class Ticket {

    Costumer costumer;
    TicketType ticketType;

    Ticket (Costumer costumer, TicketType ticketType) {
        this.costumer = costumer;
        this.ticketType = ticketType;
    }

    //Hämtar pris för antingen biljett eller månadskort
    //Här använder vi av en if and else metod som returnera ticket type vi får från enum klass
    //Om ticket type är == dag så returnera den getDay pris metoden annars returnera den get month pris metoden
    public int getTicketPrice () {

        if (this.ticketType == TicketType.DAY) {
            return getDayPrice();
        }
        else {
            return getMonthPrice();
        }
    }

    //Denna metoden Hämtar pris för en månadskort utifrån åldern
    private int getMonthPrice () {

        if (costumer.getAge() < 18 || costumer.getAge() >= 65) {
            return 450;
        }
        else {
            return 600;
        }
    }

    //Denna metoden Hämtar pris för en biljett utifrån åldern
    private int getDayPrice () {

        if (costumer.getAge() < 18 || costumer.getAge() >= 65) {
            return 20;
        }
        else {
            return 35;
        }
    }

    //Väljer antingen biljett eller måndadskort
    private static TicketType selectTicketType () {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter 1 for day, enter 2 for month: ");
        int input = scan.nextInt();

        if (input == 1) {
            return TicketType.DAY;
        }
        else {
            return TicketType.MONTH;
        }
    }

    //Hur mycket personen ska betala utifrån åldern
    public static void sellTicket () {

        //skapa en ny person
        Costumer costumer = createCustomer();
        //väljer en ny ticket type
        TicketType ticketType = selectTicketType();

        //parameter från ovan
        Ticket ticket = new Ticket(costumer, ticketType);

        tickets.add(ticket);
        //den ligger fortfarande kvar i listan
        System.out.println(ticket.getTicketPrice() + " kr");
    }
}
