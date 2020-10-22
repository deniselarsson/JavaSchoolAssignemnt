package object;

import java.util.ArrayList;

public class Main {

    public static void main (String[] args) {


        ArrayList<Car> carList = new ArrayList<>(10);

        //Skapa en array som håller10 bilar och lägg till 10 bilar i den.
        carList.add(new Car("Black", "KMI 937"));
        carList.add(new Car("White", "LLI 536"));
        carList.add(new Car("Blue", "SSU 657"));
        carList.add(new Car("Red", "EEI 947"));
        carList.add(new Car("Yellow", "TER 846"));
        carList.add(new Car("Metallic", "FET 746"));
        carList.add(new Car("Pink", "REW 545"));
        carList.add(new Car("Dark Blue ", "PJH 635"));
        carList.add(new Car("Lilac", "WEF 908"));
        carList.add(new Car("Grey", "YER 645"));

        //Skriv ut arraylistan i konsolen
        ShowCar(carList.get(0));
        ShowCar(carList.get(1));
        ShowCar(carList.get(2));
        ShowCar(carList.get(3));
        ShowCar(carList.get(4));
        ShowCar(carList.get(5));
        ShowCar(carList.get(6));
        ShowCar(carList.get(7));
        ShowCar(carList.get(8));
        ShowCar(carList.get(9));

    }
    public static void ShowCar(Car car){

        System.out.println("Car registration number is: " + car.getRegNumber());
        System.out.println("Car color is: " + car.getColor()+ "\n");
    }
}
