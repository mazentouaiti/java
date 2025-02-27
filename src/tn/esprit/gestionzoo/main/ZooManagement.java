package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.*;

public class ZooManagement {
    public static void main(String[] args) {
        Zoo zoo = new Zoo("Esprit Zoo");

        Dolphin dolphin1 = new Dolphin("Flipper", 5, "Mammal", "Ocean", 25.0f);
        Dolphin dolphin2 = new Dolphin("Echo", 4, "Mammal", "Ocean", 22.0f);
        Penguin penguin1 = new Penguin("Pingu", 3, "Bird", "Antarctica", 10.0f);
        Penguin penguin2 = new Penguin("Skipper", 6, "Bird", "Antarctica", 15.0f);

        zoo.addAquaticAnimal(dolphin1);
        zoo.addAquaticAnimal(dolphin2);
        zoo.addAquaticAnimal(penguin1);
        zoo.addAquaticAnimal(penguin2);

        System.out.println("\nAquatic Animals Swimming:");
        zoo.showAquaticAnimalsSwimming();

        System.out.println("\nAquatic Animals Count:");
        zoo.displayNumberOfAquaticsByType();

        System.out.println("\nMax Penguin Swimming Depth: " + zoo.maxPenguinSwimmingDepth() + " meters.");
    }
}
