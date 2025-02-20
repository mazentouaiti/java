package tn.esprit.gestionzoo.entities;

public class Terrestrial extends Animal {
    protected int nbrLegs;

    // ✅ Constructeur par défaut
    public Terrestrial() {
        super();
        this.nbrLegs = 4; // Par défaut, 4 pattes
    }

    // ✅ Constructeur paramétré
    public Terrestrial(String name, int age, String family, int nbrLegs) {
        super(name, age, family);
        this.nbrLegs = nbrLegs;
    }

    // ✅ Getter
    public int getNbrLegs() {
        return nbrLegs;
    }

    // ✅ Redéfinition de toString()
    @Override
    public String toString() {
        return super.toString() + ", nbrLegs=" + nbrLegs;
    }
}
