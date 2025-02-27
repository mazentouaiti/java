package tn.esprit.gestionzoo.entities;

import java.util.ArrayList;

public class Zoo {
    private String name;
    private ArrayList<Animal> animals;
    private Aquatic[] aquaticAnimals;
    private int aquaticCount;
    private static final int MAX_ANIMALS = 25;
    private static final int MAX_AQUATIC = 10;

    public Zoo(String name) {
        if (name.isEmpty()) {
            throw new IllegalArgumentException("Zoo name cannot be empty.");
        }
        this.name = name;
        this.animals = new ArrayList<>();
        this.aquaticAnimals = new Aquatic[MAX_AQUATIC];
        this.aquaticCount = 0;
    }
    public boolean isZooFull() {
        return animals.size() >= MAX_ANIMALS;
    }

    public boolean addAnimal(Animal animal) {
        if (isZooFull()) {
            System.out.println("Zoo is full! Cannot add more animals.");
            return false;
        }
        if (animals.contains(animal)) {
            System.out.println("Animal already exists in the zoo.");
            return false;
        }
        animals.add(animal);
        return true;
    }

    public void addAquaticAnimal(Aquatic aquatic) {
        if (aquaticCount < MAX_AQUATIC) {
            aquaticAnimals[aquaticCount++] = aquatic;
        } else {
            System.out.println("The aquatic section is full!");
        }
    }

    public void showAquaticAnimalsSwimming() {
        for (int i = 0; i < aquaticCount; i++) {
            aquaticAnimals[i].swim();
        }
    }

    public float maxPenguinSwimmingDepth() {
        float maxDepth = 0;
        for (int i = 0; i < aquaticCount; i++) {
            if (aquaticAnimals[i] instanceof Penguin) {
                float depth = ((Penguin) aquaticAnimals[i]).getSwimmingDepth();
                if (depth > maxDepth) {
                    maxDepth = depth;
                }
            }
        }
        return maxDepth;
    }

    public void displayNumberOfAquaticsByType() {
        int dolphinCount = 0, penguinCount = 0;
        for (int i = 0; i < aquaticCount; i++) {
            if (aquaticAnimals[i] instanceof Dolphin) {
                dolphinCount++;
            } else if (aquaticAnimals[i] instanceof Penguin) {
                penguinCount++;
            }
        }
        System.out.println("Number of Dolphins: " + dolphinCount);
        System.out.println("Number of Penguins: " + penguinCount);
    }
}
