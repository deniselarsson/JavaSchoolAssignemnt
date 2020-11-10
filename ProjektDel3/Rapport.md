###Grupp3Projekt Del 3

####Textual Analysis: 
Vi vill sälja biljett, vi vill sälja månadskort, spara namn, skriva ut namn/lista, 
hur mycket en kund ska betala utifrån åldern, mata in värden.

####Kandidater: 
Konduktör, costumer, biljett, scanner klass som  tar in värden, 
namn, ålder, biljett, månadskort, resenär input, skriva ut en lista , 
sälja biljett/månadskort, spara namn(lista), spara ålder, verifiera ålder

#####Objekt: Konduktör, costumer, biljett

#####Metoder: scanner klass som  tar in värden, biljett, månadskort, resenär input, skriva ut en lista , sälja biljett/månadskort, spara namn(lista), spara ålder, verifiera ålder

#####Variaber: int price; int age; String name;

#####Aktörer: konduktören
 
####Vilka av kandidaterna som blev vad:
Scanner klass som tar in input och ticket som som när biljett säljs hämtar pris baserat på input(ålder och val av typ av biljett(dag/månad)) : blev våra objekt.
Konduktör: det visade sig att vi inte behövde denna klassen som vi hade tänkt från början.
Kund, biljett, biljett typ: blev våra klasser.
Ålder, biljett, månadskort, resenär input, skriva ut en lista , sälja biljett/månadskort, spara namn(lista), spara ålder, verifiera ålder: blev våra metoder.
 
#####Objekt: Scanner

####Metoder:
printNames () createCustomer() ticketPrice() validateMonthPrice() validateDayPrice() selectTicketType() sellTicket()

#####Variaber: 
Costumer costumer; TicketType ticketType; String name; int age; enum DAY; enum MONTH;

#####Aktörer: Konduktören

#####Motivering av objekt : 
Vi valde Scanner för att användaren ska kunna mata in input och att vi kan skriva ut text.

####Daglogg
#####29/10/2020:Jag gjorde ett exempel på UML Diagrammet. Började med och koda konduktören klassen. Upptäckte väldigt snabbt att det var svårt och koda utan dem andra klasser. Så började med och bygga upp en skeleton.

#####30/10/2020:Vi kom överens med att alla försöker implementera och diskutera hur vi tänkte och vad som funkar eller ej. 

#####2/11/2020:Vi gick igenom varandras kod idag och diskuterade vad som kunde förbättras, kom fram till att vi skulle flytta ut metoder från main till klasser

#####3/11/2020: Vi diskuterarade om vi var nöjda med koden, gick igenom vad olika klasser och metoder gör.

#####4/11/2020: Idag har vi skapat UML diagram, färdigställt koden, arbetat med rapporten. 

#####6/11/2020: Idag sitter jag själv och jobba, fick lite feedback, ändrade class namnet från person till costumer och la till en else i main metoden.

#####10/11/2020: Idag kollade vi igenom projektet och fick feedback från Sandra och uppdaterade powerpoint och checkade av ifall alla var nöjda.

#####På vilket sätt har ni använt er av Objektorentering? 
Vi har använt oss av objektorientering genom att använda oss av 3 olika klasser vars objekt 
interagerar med varandra,vi använder encapsulation som binder ihop data med metoder och skyddar
privata variabler.

#####Vilka klasser och metoder har vem haft ansvar för?
Vi började med att alla skulle ta varsin klass men det gick inte så bra så bestämde vi oss för att koda var för sig och sedan återkoppla och diskutera.

####Hur har det gått att jobba i grupp? 
Bra, alla är öppen och vi kommunicera bra.

####Var det nåt som blev enklare att vara i grupp än att vara själv? 
Jag gillar helst och jobba i grupp för det är då man lär sig som mest, men det kan vara svårt ibland om man har olika kunskaper och för min del med denna grupp handlade 
det mest om att jag delade min kunskap till dom och inte så mycket om att vi lär från varandra. Men vi är ett team så det handlar om "vi" och jag är glad om jag kunde hjälpa dom 
och vem vet nästa kurs kanske är det dom som lär mig :) 

####Vad har ni stött på för svårigheter med att jobba i grupp?
Att synka tid som ska passa alla, så det är också en av anledning till att vi sitter och jobba en del själv för att projektet ska driva framåt.
Att det alltid finns en person som driver kommunikationen och komma med förslag innan någon annan våga säga sitt. Men det har ändå gått väldigt bra och ingen känner sig utanför.
