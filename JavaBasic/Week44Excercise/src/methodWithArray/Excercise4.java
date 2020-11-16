package methodWithArray;

import java.util.ArrayList;

public class Excercise4 {

      /*
    Skriv en metod som skapar och returnerar en ArrayList av djurReturen ska tas emot i
    metodanropet i main och skrivas ut där
     */
    public static void main (String []args){

        ArrayList<String> result = getAnimals();

        System.out.println(result);

    }

    public static ArrayList<String> getAnimals() {

        ArrayList<String> animals = new ArrayList<>();

        animals.add("Horse");
        animals.add("Tiger");
        animals.add("Dog");
        animals.add("Cat");

        return animals;
    }
}
