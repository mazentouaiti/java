package tn.esprit.gestionzoo.entities;

public class Penguin extends Aquatic {
    private float swimmingDepth;

    public Penguin() {
        super();
        this.swimmingDepth = 0.0f;
    }

    public Penguin(String name, int age, String family, String habitat, float swimmingDepth) {
        super(name, age, family, habitat);
        this.swimmingDepth = swimmingDepth;
    }

    public float getSwimmingDepth() {
        return swimmingDepth;
    }

    @Override
    public String toString() {
        return super.toString() + ", swimmingDepth=" + swimmingDepth;
    }

    @Override
    public void swim() {
        System.out.println("The penguin " + name + " is diving to a depth of " + swimmingDepth + " meters.");
    }
}
