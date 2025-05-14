package tn.esprit.gestionzoo.entities;
import tn.esprit.gestionzoo.entities.IGestion;


import java.util.*;

public class SocieteArrayList implements IGestion<Employe> {
    private List<Employe> liste = new ArrayList<>();

    @Override
    public void ajouterEmploye(Employe e) {
        liste.add(e);
    }

    @Override
    public boolean rechercherEmploye(String nom) {
        return liste.stream().anyMatch(e -> e.getNom().equalsIgnoreCase(nom));
    }

    @Override
    public boolean rechercherEmploye(Employe e) {
        return liste.contains(e);
    }

    @Override
    public void supprimerEmploye(Employe e) {
        liste.remove(e);
    }

    @Override
    public void displayEmploye() {
        for (Employe e : liste) {
            System.out.println(e);
        }
    }

    @Override
    public void trierEmployeParId() {
        Collections.sort(liste);
    }

    @Override
    public void trierEmployeParNomDépartementEtGrade() {
        liste.sort(Comparator
                .comparing(Employe::getNomDepartament)
                .thenComparingInt(Employe::getGrade));
    }
}
