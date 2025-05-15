package java.out.production.zoo;

public class Zoo {
    private Animal[] animals;
    private String name;
    private String city;
    private int nbrCages;
    private int animalCount;

    public Zoo(String name, String city, int nbrCages) {
        this.name = name;
        this.city = city;
        this.nbrCages = nbrCages;
        this.animals = new Animal[nbrCages];
        this.animalCount = 0;
    }

    public void addAnimal(Animal animal) {
        if (animalCount < nbrCages) {
            animals[animalCount++] = animal;
        } else {
            System.out.println("Zoo is full, cannot add more animals!");
        }
    }

    public void displayZoo() {
        System.out.println("Nom du zoo: " + name);
        System.out.println("Ville: " + city);
        System.out.println("Nombre de cages: " + nbrCages);
        System.out.println("Animaux dans le zoo:");
        for (int i = 0; i < animalCount; i++) {
            System.out.println(animals[i]);
        }
    }

    @Override
    public String toString() {
        return "Zoo { " +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", nbrCages=" + nbrCages +
                "}";
    }
}