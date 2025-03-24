package tn.esprit.gestionzoo.entities;

public class Dolphin extends Aquatic {
    private float swimmingSpeed;

    public Dolphin(String name, int age, String habitat, float swimmingSpeed) {
        super(name, age, habitat);
        this.swimmingSpeed = swimmingSpeed;
    }

    @Override
    public void swim() {
        System.out.println("This dolphin is swimming.");
    }

    @Override
    public String toString() {
        return "Dolphin [name=" + getName() + ", age=" + getAge() + ", habitat=" + getHabitat() + ", swimmingSpeed="
                + swimmingSpeed + "]";
    }
    @Override
    public void makeSound() {
        System.out.println(getName() + " makes clicking and whistling sounds!");
    }
}
