package tn.esprit.gestionzoo.entities;

import java.util.ArrayList;

public class Zoo {
    private String name;
    private ArrayList<Animal> animals;
    private static final int MAX_ANIMALS = 25;

    // ✅ Constructeur
    public Zoo(String name) {
        if (name.isEmpty()) {
            throw new IllegalArgumentException("Zoo name cannot be empty.");
        }
        this.name = name;
        this.animals = new ArrayList<>();
    }

    // ✅ Ajout d'un animal (Vérification de doublon + Capacité)
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

    // ✅ Recherche d'un animal
    public int searchAnimal(Animal animal) {
        return animals.indexOf(animal);
    }

    // ✅ Suppression d'un animal
    public boolean removeAnimal(Animal animal) {
        return animals.remove(animal);
    }

    // ✅ Vérification si le zoo est plein
    public boolean isZooFull() {
        return animals.size() >= MAX_ANIMALS;
    }

    // ✅ Comparer 2 zoos
    public static Zoo comparerZoo(Zoo z1, Zoo z2) {
        return (z1.animals.size() > z2.animals.size()) ? z1 : z2;
    }

    // ✅ Affichage des animaux
    public void showAnimals() {
        for (Animal a : animals) {
            System.out.println(a);
        }
    }
}
