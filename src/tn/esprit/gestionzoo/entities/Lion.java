package tn.esprit.gestionzoo.entities;

public class Lion extends Terrestrial {

    public Lion(String name, int age, String habitat, int nbrLegs) {
        super(name, age, habitat, nbrLegs);
    }

    @Override
    public String toString() {
        return "Lion [name=" + getName() + ", age=" + getAge() + ", habitat=" + getHabitat() + ", nbrLegs=" + getNbrLegs() + "]";
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " roars loudly!");
    }
}
