package tn.esprit.gestionzoo.entities;

public class Animal {
    protected String name;
    protected int age;
    protected String family;

    public Animal() {
        this.name = "Unknown";
        this.age = 0;
        this.family = "Unknown";
    }

    public Animal(String name, int age, String family) {
        this.name = name;
        this.age = Math.max(age, 0); // Âge ne peut pas être négatif
        this.family = family;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getFamily() {
        return family;
    }

    @Override
    public String toString() {
        return "Animal{name='" + name + "', age=" + age + ", family='" + family + "'}";
    }
}
