package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.*;

public class ZooManagement {
    public static void main(String[] args) {
        // ✅ Création des objets
        Dolphin dolphin = new Dolphin("Flipper", 5, "Mammal", "Ocean", 25.0f);
        Penguin penguin = new Penguin("Pingu", 3, "Bird", "Antarctica", 10.0f);
        Terrestrial lion = new Terrestrial("Simba", 7, "Feline", 4);

        // ✅ Création du zoo
        Zoo zoo = new Zoo("Esprit Zoo");

        // ✅ Ajout des animaux
        zoo.addAnimal(dolphin);
        zoo.addAnimal(penguin);
        zoo.addAnimal(lion);

        // ✅ Recherche d'un animal
        System.out.println("Index of dolphin: " + zoo.searchAnimal(dolphin));

        // ✅ Affichage des animaux
        System.out.println("\nAnimals in the zoo:");
        zoo.showAnimals();

        // ✅ Test des méthodes swim()
        dolphin.swim();
        penguin.swim();
    }
}
