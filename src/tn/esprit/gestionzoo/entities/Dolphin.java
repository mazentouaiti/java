package tn.esprit.gestionzoo.entities;

public class Dolphin extends Aquatic {
    private float swimmingSpeed;

    public Dolphin() {
        super();
        this.swimmingSpeed = 0.0f;
    }

    public Dolphin(String name, int age, String family, String habitat, float swimmingSpeed) {
        super(name, age, family, habitat);
        this.swimmingSpeed = swimmingSpeed;
    }

    public float getSwimmingSpeed() {
        return swimmingSpeed;
    }

    @Override
    public String toString() {
        return super.toString() + ", swimmingSpeed=" + swimmingSpeed;
    }

    @Override
    public void swim() {
        System.out.println("The dolphin " + name + " is swimming gracefully at speed " + swimmingSpeed + " km/h.");
    }
}
