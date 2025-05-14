package tn.esprit.gestionzoo.entities;

public class Animal {
    private String name;
    private int age;
    private String habitat;

    public Animal(String name, int age, String habitat) {
        this.name = name;
        this.age = age;
        this.habitat = habitat;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public String getHabitat() {
        return this.habitat;
    }

    public void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative");
        }
        this.age = age;
    }

    @Override
    public String toString() {
        return "Animal [name=" + name + ", age=" + age + ", habitat=" + habitat + "]";
    }
}
