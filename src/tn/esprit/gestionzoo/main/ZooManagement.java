package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.*;

public class ZooManagement {
    public static void main(String[] args) {
        // Create a new Zoo object
        Zoo myZoo = new Zoo("Wildlife Zoo", "Paris", 5);

        // Create animal instances
        Dolphin dolphin = new Dolphin("Flipper", 5, "Ocean", 25.5f);
        Penguin penguin = new Penguin("Pingu", 3, "Antarctic", 10.0f);
        Terrestrial bear = new Terrestrial("Baloo", 10, "Forest", 4) {
            @Override
            public void makeSound() {
                System.out.println(getName() + " growls.");
            }
        };

        // Add animals to the zoo
        try {
            myZoo.addAnimal(dolphin);
            myZoo.addAnimal(penguin);
            myZoo.addAnimal(bear);

            // Display the number of animals in the zoo
            System.out.println("Number of animals in the zoo: " + myZoo.getAnimalCount());

            // Display the number of aquatic animals by type
            myZoo.displayNumberOfAquaticsByType();

            // Test eating behaviors
            System.out.println("\nTesting food habits:");
            penguin.eatMeat(Food.MEAT);

            bear.eatMeat(Food.MEAT);
            bear.eatPlant(Food.PLANT);
            bear.eatPlantAndMeet(Food.BOTH);

            // Test movements
            System.out.println("\nTesting movement:");
            penguin.swim();
            bear.makeSound();

        } catch (ZooFullException | InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
    }
}
