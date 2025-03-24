package tn.esprit.gestionzoo.entities;

import tn.esprit.gestionzoo.main.ZooFullException;
import tn.esprit.gestionzoo.main.InvalidAgeException;

public class Zoo {
    private String name;
    private String city;
    private final int nbrCages;
    private Animal[] animals;
    private Aquatic[] aquaticAnimals;
    private Terrestrial[] terrestrialAnimals;  // Store terrestrial animals
    private int animalCount = 0;

    public Zoo(String name, String city, int nbrCages) {
        this.name = name;
        this.city = city;
        this.nbrCages = nbrCages;
        this.animals = new Animal[nbrCages];
        this.aquaticAnimals = new Aquatic[10];
        this.terrestrialAnimals = new Terrestrial[10];  // Adjusted for 10 terrestrial animals
    }

    public void addAnimal(Animal animal) throws ZooFullException, InvalidAgeException {
        if (animal.getAge() < 0) {
            throw new InvalidAgeException("Age cannot be negative!");
        }
        if (animalCount < nbrCages) {
            animals[animalCount++] = animal;
        } else {
            throw new ZooFullException("Zoo is full! Cannot add more animals.");
        }
    }
    // Method to get the number of animals in the zoo
    public int getAnimalCount() {
        int count = 0;
        for (Animal animal : animals) {
            if (animal != null) {
                count++;
            }
        }
        return count;
    }
    // Method to display the number of aquatic animals by type (Dolphins and Penguins)
    public void displayNumberOfAquaticsByType() {
        int dolphinCount = 0;
        int penguinCount = 0;

        for (Aquatic aquatic : aquaticAnimals) {
            if (aquatic != null) {
                if (aquatic instanceof Dolphin) {
                    dolphinCount++;
                } else if (aquatic instanceof Penguin) {
                    penguinCount++;
                }
            }
        }

        System.out.println("Number of Dolphins: " + dolphinCount);
        System.out.println("Number of Penguins: " + penguinCount);
    }
    public void addTerrestrialAnimal(Terrestrial terrestrial) {
        for (int i = 0; i < terrestrialAnimals.length; i++) {
            if (terrestrialAnimals[i] == null) {
                terrestrialAnimals[i] = terrestrial;
                break;
            }
        }
    }

    public Animal[] getAnimals() {
        return animals;
    }

    public Aquatic[] getAquaticAnimals() {
        return aquaticAnimals;
    }

    public Terrestrial[] getTerrestrialAnimals() {
        return terrestrialAnimals;
    }

    public void addAquaticAnimal(Aquatic dolphin) {
    }

}
