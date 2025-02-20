package tn.esprit.gestionzoo.entities;

public class Penguin extends Aquatic {
    private float swimmingDepth;

    // ✅ Constructeur par défaut
    public Penguin() {
        super();
        this.swimmingDepth = 0.0f;
    }

    // ✅ Constructeur paramétré
    public Penguin(String name, int age, String family, String habitat, float swimmingDepth) {
        super(name, age, family, habitat);
        this.swimmingDepth = swimmingDepth;
    }

    // ✅ Getter
    public float getSwimmingDepth() {
        return swimmingDepth;
    }

    // ✅ Redéfinition de toString()
    @Override
    public String toString() {
        return super.toString() + ", swimmingDepth=" + swimmingDepth;
    }
}
