package methodWithArray;

public class Excercise3 {

    public static void main (String[]args){


        String [] animals = {"Horse,", "Dog"};

        animals = getAnimals(animals);

        for (String animal : animals){
            System.out.println(animal);
        }

    }

    /*
    Skriv en metod som tar emot och returnerar en array av djur
    Returen ska tas emot i metodanropet i main
    och skrivas ut där.
    Tänk på att använda For Each Loop eller For loop till detta
    */

    public static String[] getAnimals(String[] animals){

        return animals;
    }
}
