package Assignment11.Exercise2;

import java.util.Date;

public class Cat extends Animal {

    String color;

    public Cat(String id, String source, Date dateOfBirth, String color) {
        super(id, source, dateOfBirth, color);
    }

    public void makeSound() {
        System.out.println("meo meo");
    }

}
