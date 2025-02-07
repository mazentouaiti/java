import java.util.Scanner;

public class ZooManagement {

    public static void main(String[] args) {

        Zoo myZoo1 = new Zoo("Mon Zoo 1", "Paris", 20);
        Zoo myZoo2 = new Zoo("Mon Zoo 2", "Lyon", 15);

        Animal lion = new Animal("Felidae", "Lion", 5, true);
        Animal tiger = new Animal("Felidae", "Tiger", 4, true);

        myZoo1.addAnimal(lion);
        myZoo1.addAnimal(tiger);


        myZoo1.removeAnimal(lion);
        myZoo1.removeAnimal(lion);


        myZoo1.displayAnimals();

        // Test si le zoo est plein
        System.out.println("Le zoo 1 est-il plein ? " + myZoo1.isZooFull());


        Zoo largestZoo = Zoo.comparerZoo(myZoo1, myZoo2);


        if (largestZoo != null) {
            System.out.println("Le zoo avec le plus d'animaux est: " + largestZoo.getName());
        } else {
            System.out.println("Les zoos ont un nombre égal d'animaux.");
        }


        for (int i = 0; i < 30; i++) {
            Animal newAnimal = new Animal("Family" + i, "Animal" + i, 3, true);
            myZoo1.addAnimal(newAnimal);
        }


        myZoo1.displayAnimals();
    }
}
 