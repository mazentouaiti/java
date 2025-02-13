package tn.esprit.gestionzoo.entities;

public class Zoo {
    private static final int MAX_ANIMALS = 25;  // Constante pour le nombre max d'animaux
    private String name;
    private String city;
    private Animal[] animals;
    private int animalCount;


    public Zoo(String name, String city) {
        setName(name);
        this.city = city;
        this.animals = new Animal[MAX_ANIMALS];
        this.animalCount = 0;
    }


    public String getName() { return name; }
    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            System.out.println("Le nom du zoo ne peut pas être vide. Assignation d'un nom par défaut.");
            this.name = "Zoo Inconnu";
        } else {
            this.name = name;
        }
    }

    public String getCity() { return city; }
    public void setCity(String city) { this.city = city; }

    public int getAnimalCount() { return animalCount; }
    public static int getMaxAnimals() { return MAX_ANIMALS; }


    public boolean isZooFull() {
        return animalCount >= MAX_ANIMALS;
    }


    public boolean addAnimal(Animal animal) {
        if (isZooFull()) {
            System.out.println("Le zoo est plein. Impossible d'ajouter l'animal " + animal.getName());
            return false;
        }

        for (int i = 0; i < animalCount; i++) {
            if (animals[i].getName().equalsIgnoreCase(animal.getName())) {
                System.out.println("L'animal " + animal.getName() + " est déjà présent dans le zoo.");
                return false;
            }
        }

        animals[animalCount++] = animal;
        System.out.println("Animal ajouté : " + animal.getName() + " de la famille " + animal.getFamily());
        return true;
    }


    public void displayAnimals() {
        System.out.println("Animaux du zoo " + name + " (" + city + ") :");
        for (int i = 0; i < animalCount; i++) {
            System.out.println(animals[i]);
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Zoo: ").append(name).append(" (").append(city).append(")\n");
        sb.append("Animaux: \n");
        for (int i = 0; i < animalCount; i++) {
            sb.append(animals[i].toString()).append("\n");
        }
        return sb.toString();
    }
}
