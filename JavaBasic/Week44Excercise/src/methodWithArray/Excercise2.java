package methodWithArray;

public class Excercise2 {
    /*
    Skriv en metod som skapar och skriver ut en array av djur
    Tänk på att använda For Each Loop eller For loop till detta
    */

    public static void main (String[] args) {

        arrayOfAnimal();
    }

    public static void arrayOfAnimal () {

        String[] animal = {"Dog", "Cat", "Rabbit", "Bird"};

        //for each loop som skriver ut alla djur från array listan
        //(typ variabelnamn: arraynamn)
        for (String name : animal) {
            System.out.println(name);
        }
    }
}
