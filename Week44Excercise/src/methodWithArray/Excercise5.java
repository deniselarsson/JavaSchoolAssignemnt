package methodWithArray;

import java.util.ArrayList;

public class Excercise5 {
    public static void main (String []args){

        ArrayList<String> animals = new ArrayList<>();

        animals.add("Horse");
        animals.add("Dog");
        animals.add("Cat");

        ArrayList<String> result = getAnimals(animals);

        System.out.println(result);
    }
    /*
    Skriv en metod som tar emot och returnerar en ArrayList av djurReturen ska tas emot
    i metodanropet i main och skrivas ut där
     */


    public static ArrayList<String> getAnimals(ArrayList<String> animals){

        return animals;
    }

}
