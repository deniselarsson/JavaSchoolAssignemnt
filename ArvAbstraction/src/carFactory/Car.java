package carFactory;

abstract public class Car {

    String color;
    int year;

    public int getYear (int year) {
        return year;
    }

    public void setYear (int year) {
        this.year = year;
    }

    public String getColor (String Color) {
        return color;
    }

    public void setColor (String color) {
        this.color = color;
    }

    abstract public void yearOfCar(int year);

    abstract public void colorOfTheCar(String color);
}
