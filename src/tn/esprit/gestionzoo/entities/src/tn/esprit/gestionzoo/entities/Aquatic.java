package tn.esprit.gestionzoo.entities;

public class Aquatic extends Animal {
    protected String habitat;

    // ✅ Constructeur par défaut
    public Aquatic() {
        super(); // Appelle le constructeur par défaut de `Animal`
        this.habitat = "Unknown";
    }

    // ✅ Constructeur paramétré
    public Aquatic(String name, int age, String family, String habitat) {
        super(name, age, family);
        this.habitat = habitat;
    }

    // ✅ Getter
    public String getHabitat() {
        return habitat;
    }

    // ✅ Redéfinition de toString()
    @Override
    public String toString() {
        return super.toString() + ", habitat='" + habitat + "'";
    }

    // ✅ Méthode swim()
    public void swim() {
        System.out.println("This aquatic animal is swimming.");
    }
}
