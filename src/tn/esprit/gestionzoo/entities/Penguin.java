package tn.esprit.gestionzoo.entities;

public class Penguin extends Aquatic {
    private float swimmingDepth;

    public Penguin(String name, int age, String habitat, float swimmingDepth) {
        super(name, age, habitat);
        this.swimmingDepth = swimmingDepth;
    }

    @Override
    public void swim() {
        System.out.println("This penguin is swimming.");
    }

    @Override
    public String toString() {
        return "Penguin [name=" + getName() + ", age=" + getAge() + ", habitat=" + getHabitat() + ", swimmingDepth="
                + swimmingDepth + "]";
    }
    @Override
    public void makeSound() {
        System.out.println(getName() + " is making a penguin sound!");
    }
}
