package tn.esprit.gestionzoo.entities;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class DepartementHashSet implements IDepartement<Departement> {
    private Set<Departement> set = new HashSet<>();

    @Override
    public void ajouterDepartement(Departement d) {
        set.add(d);
    }

    @Override
    public boolean rechercherDepartement(String nom) {
        return set.stream().anyMatch(d -> d.getNomDepartement().equalsIgnoreCase(nom));
    }

    @Override
    public boolean rechercherDepartement(Departement d) {
        return set.contains(d);
    }

    @Override
    public void supprimerDepartement(Departement d) {
        set.remove(d);
    }

    @Override
    public void displayDepartement() {
        set.forEach(System.out::println);
    }

    @Override
    public TreeSet<Departement> trierDepartementById() {
        return new TreeSet<>(set);
    }
}
