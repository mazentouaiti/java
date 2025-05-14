package tn.esprit.gestionzoo.entities;

public abstract class Terrestrial extends Animal implements Omnivore<Food> {
    private int nbrLegs; // Number of legs for terrestrial animals

    public Terrestrial(String name, int age, String habitat, int nbrLegs) {
        super(name, age, habitat);
        this.nbrLegs = nbrLegs;
    }
    @Override
    public void eatMeat(Food meat) {
        if (meat == Food.MEAT || meat == Food.BOTH) {
            System.out.println(getName() + " is eating meat.");
        } else {
            System.out.println(getName() + " cannot eat this food.");
        }
    }

    @Override
    public void eatPlant(Food plant) {
        if (plant == Food.PLANT || plant == Food.BOTH) {
            System.out.println(getName() + " is eating plants.");
        } else {
            System.out.println(getName() + " cannot eat this food.");
        }
    }

    @Override
    public void eatPlantAndMeet(Food food) {
        if (food == Food.BOTH) {
            System.out.println(getName() + " is eating both meat and plants.");
        } else {
            System.out.println(getName() + " cannot eat this food.");
        }
    }
    public int getNbrLegs() {
        return nbrLegs;
    }

    public void setNbrLegs(int nbrLegs) {
        this.nbrLegs = nbrLegs;
    }

    @Override
    public String toString() {
        return "Terrestrial [name=" + getName() + ", age=" + getAge() + ", habitat=" + getHabitat() + ", nbrLegs=" + nbrLegs + "]";
    }

    public abstract void makeSound();
}
