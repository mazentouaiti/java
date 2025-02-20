package tn.esprit.gestionzoo.entities;

public class Dolphin extends Aquatic {
    private float swimmingSpeed;

    // ✅ Constructeur par défaut
    public Dolphin() {
        super();
        this.swimmingSpeed = 0.0f;
    }

    // ✅ Constructeur paramétré
    public Dolphin(String name, int age, String family, String habitat, float swimmingSpeed) {
        super(name, age, family, habitat);
        this.swimmingSpeed = swimmingSpeed;
    }

    // ✅ Getter
    public float getSwimmingSpeed() {
        return swimmingSpeed;
    }

    // ✅ Redéfinition de toString()
    @Override
    public String toString() {
        return super.toString() + ", swimmingSpeed=" + swimmingSpeed;
    }

    // ✅ Redéfinition de swim()
    @Override
    public void swim() {
        System.out.println("This dolphin is swimming.");
    }
}
