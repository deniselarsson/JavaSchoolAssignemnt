package object;

//Skapa en klass Car.
public class Car {

    //String color.
    //String reg nummer
    private String color;
    private String regNumber;

    public Car (String color, String regNumber) {
        this.color = color;
        this.regNumber = regNumber;
    }
    public String getRegNumber () {
        return this.regNumber;
    }
    public void setRegNumber (String regNumber) {
        this.regNumber = regNumber;
    }
    public String getColor () {
        return this.color;
    }
    public void setColor (String color) {
        this.color = color;
    }
}
