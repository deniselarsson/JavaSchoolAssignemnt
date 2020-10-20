package carFactory;

public class NewCar extends Car{

    @Override
    public void yearOfCar (int year) {
        setYear(year);
        System.out.println(year);
    }

    @Override
    public void colorOfTheCar (String color) {
        setColor(color);
        System.out.println(color);
    }

    public void brandOfTheCar(Brands brands){
        System.out.println(brands);
    }
}
