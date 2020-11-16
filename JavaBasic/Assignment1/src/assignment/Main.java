package assignment;

public class Main {

    public static void main (String[] args) {

        Person sara = new Person(20);
        Person pelle = new Person(21);
        Person calle = new Person(22);

        int result = sara.getAge() + pelle.getAge() + calle.getAge();

        System.out.println(result);
    }
}

