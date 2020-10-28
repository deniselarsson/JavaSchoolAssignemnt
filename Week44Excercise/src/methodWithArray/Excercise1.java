package methodWithArray;

public class Excercise1 {

    /*
    Skriv en metod som skapar och returnerar en array av djur
    Returen ska tas emot i metodanropet i main och skrivas ut där
    Tänk på att använda For Each Loop eller For loop till detta
    */

    public static void main (String[] args) {

        String [] animals = getAnimals(); // metodanropet
        System.out.println(animals);

    }
    public static String[] getAnimals () {

        String[] animals = {"Horse", "Cow", "Pig", "Giraff"};

        for (String i : animals) {
            System.out.println(i);
        }
        return animals;
    }
}