package carFactory;

public class Main {

    public static void main (String[]args){

        NewCar carOne = new NewCar();
        NewCar carTwo = new NewCar();
        NewCar carThird = new NewCar();

        carOne.brandOfTheCar(Brands.SAAB);
        carOne.colorOfTheCar("Black");
        carOne.yearOfCar(1995 );
        System.out.println("\n");

        carTwo.brandOfTheCar(Brands.VOLVO);
        carTwo.colorOfTheCar("Grey");
        carTwo.yearOfCar(2000);
        System.out.println("\n");

        carThird.brandOfTheCar(Brands.TOYOTA);
        carThird.colorOfTheCar("White");
        carThird.yearOfCar(1997);
        System.out.println("\n");
    }
}
