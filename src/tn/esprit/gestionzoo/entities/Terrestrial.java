package tn.esprit.gestionzoo.entities;

public class Terrestrial extends Animal {
    protected int nbrLegs;

    public Terrestrial() {
        super();
        this.nbrLegs = 4; // Par défaut, 4 pattes
    }

    public Terrestrial(String name, int age, String family, int nbrLegs) {
        super(name, age, family);
        this.nbrLegs = nbrLegs;
    }

    public int getNbrLegs() {
        return nbrLegs;
    }

    @Override
    public String toString() {
        return super.toString() + ", nbrLegs=" + nbrLegs;
    }
}
