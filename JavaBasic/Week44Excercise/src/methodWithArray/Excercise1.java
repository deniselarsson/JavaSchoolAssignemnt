package methodWithArray;

public class Excercise1 {
    //Returen ska tas emot i metodanropet i main och skrivas ut där

    public static void main (String[] args) {

        String [] animals = getAnimals(); // metodanropet
        System.out.println(animals);

    }
    //Skriv en metod som skapar och returnerar en array av djur
    public static String[] getAnimals () {

        String[] animals = {"Horse", "Cow", "Pig", "Giraff"};

        for (String animal : animals) {
            System.out.println(animal);
        }
        return animals;
    }
}