package tn.esprit.gestionzoo.entities;

public class Animal {
    protected String name;
    protected int age;
    protected String family;

    // ✅ Constructeur par défaut
    public Animal() {
        this.name = "Unknown";
        this.age = 0;
        this.family = "Unknown";
    }

    // ✅ Constructeur paramétré
    public Animal(String name, int age, String family) {
        this.name = name;
        this.age = Math.max(age, 0); // Âge ne peut pas être négatif
        this.family = family;
    }

    // ✅ Getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getFamily() {
        return family;
    }

    // ✅ Méthode toString()
    @Override
    public String toString() {
        return "Animal{name='" + name + "', age=" + age + ", family='" + family + "'}";
    }
}
