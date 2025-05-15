package java.out.production.zoo;

import java.out.production.zoo.Animal;
import java.out.production.zoo.Zoo;

public class ZooManagement {
    public static void main(String[] args) {
        Animal lion = new Animal("Félidé", "Lion", 5, true);
        Animal dog = new Animal("Canidé", "Snoopy", 2, true);

        Zoo myZoo = new Zoo("Wildlife Park", "Ariana", 25);
        Zoo notMyZoo = new Zoo("WaterPark", "Siliana", 25);

        myZoo.addAnimal(lion);
        myZoo.addAnimal(dog);

        myZoo.displayZoo();

        System.out.println(myZoo);
        System.out.println(notMyZoo);
        System.out.println(dog);
    }
}