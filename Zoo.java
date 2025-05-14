class Zoo {
    private Animal[] animals;
    private final int nbrCages;
    private int animalCount;
    private String name;
    private String city;

    public static final int MAX_ANIMALS = 25;

    public Zoo(String name, String city, int nbrCages) {
        this.name = name;
        this.city = city;
        this.nbrCages = nbrCages;
        this.animals = new Animal[MAX_ANIMALS];
        this.animalCount = 0;
    }

    public boolean addAnimal(Animal animal) {
        if (animalCount >= MAX_ANIMALS) {
            System.out.println("Impossible d'ajouter l'animal. Le zoo a atteint sa capacité maximale de " + MAX_ANIMALS + " animaux.");
            return false;
        }


        for (int i = 0; i < animalCount; i++) {
            if (animals[i].name.equals(animal.name)) {
                System.out.println("L'animal " + animal.name + " existe déjà dans le zoo.");
                return false;
            }
        }

        animals[animalCount++] = animal;
        System.out.println("Animal ajouté: " + animal.name + " de la famille " + animal.family);
        return true;
    }

    public boolean removeAnimal(Animal animal) {
        for (int i = 0; i < animalCount; i++) {
            if (animals[i].name.equals(animal.name)) {

                for (int j = i; j < animalCount - 1; j++) {
                    animals[j] = animals[j + 1];
                }
                animals[animalCount - 1] = null;
                animalCount--;
                System.out.println("Animal supprimé: " + animal.name);
                return true;
            }
        }
        System.out.println("Animal non trouvé dans le zoo.");
        return false;
    }

    public boolean isZooFull() {
        return animalCount >= MAX_ANIMALS;
    }

    public static Zoo comparerZoo(Zoo z1, Zoo z2) {
        if (z1.animalCount > z2.animalCount) {
            return z1;
        } else if (z1.animalCount < z2.animalCount) {
            return z2;
        } else {
            System.out.println("Les deux zoos ont le même nombre d'animaux.");
            return null;
        }
    }

    public void displayAnimals() {
        System.out.println("Animaux dans le zoo:");
        for (int i = 0; i < animalCount; i++) {
            System.out.println(animals[i]);
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Nom du zoo: ").append(name).append("\n");
        sb.append("Ville: ").append(city).append("\n");
        sb.append("Nombre de cages: ").append(nbrCages).append("\n");
        sb.append("Animaux dans le zoo:\n");
        for (int i = 0; i < animalCount; i++) {
            sb.append(animals[i].toString()).append("\n");
        }
        return sb.toString();
    }

    public String getName() {
        return name;
    }
}
