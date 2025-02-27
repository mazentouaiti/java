package tn.esprit.gestionzoo.entities;

public abstract class Aquatic extends Animal {
    protected String habitat;

    public Aquatic() {
        super();
        this.habitat = "Unknown";
    }


    public Aquatic(String name, int age, String family, String habitat) {
        super(name, age, family);
        this.habitat = habitat;
    }


    public String getHabitat() {
        return habitat;
    }


    @Override
    public String toString() {
        return super.toString() + ", habitat='" + habitat + "'";
    }


    public abstract void swim();

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Aquatic)) return false;
        Aquatic other = (Aquatic) obj;
        return this.name.equals(other.name) && this.age == other.age && this.habitat.equals(other.habitat);
    }
}
