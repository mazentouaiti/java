package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.Animal;
import tn.esprit.gestionzoo.entities.Zoo;

import java.util.Scanner;

public class ZooManagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez le nom du zoo : ");
        String zooName = scanner.nextLine();
        System.out.print("Entrez la ville du zoo : ");
        String zooCity = scanner.nextLine();

        Zoo myZoo = new Zoo(zooName, zooCity);


        Animal lion = new Animal("Felidae", "Lion", 5, true);
        Animal tiger = new Animal("Felidae", "Tiger", 4, true);
        Animal elephant = new Animal("Elephantidae", "Elephant", 10, true);


        myZoo.addAnimal(lion);
        myZoo.addAnimal(tiger);
        myZoo.addAnimal(elephant);
        myZoo.addAnimal(new Animal("Felidae", "Lion", 3, true));  // Duplication testée


        myZoo.displayAnimals();


        System.out.println("Le zoo est-il plein ? " + myZoo.isZooFull());

        scanner.close();
    }
}
