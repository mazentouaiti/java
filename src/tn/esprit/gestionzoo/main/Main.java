package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.Departement;
import tn.esprit.gestionzoo.entities.DepartementHashSet;

import java.util.TreeSet;




public class Main {
    public static void main(String[] args) {
        DepartementHashSet departements = new DepartementHashSet();

        Departement d1 = new Departement(2, "Informatique", 15);
        Departement d2 = new Departement(1, "Ressources Humaines", 10);
        Departement d3 = new Departement(3, "Marketing", 8);

        departements.ajouterDepartement(d1);
        departements.ajouterDepartement(d2);
        departements.ajouterDepartement(d3);

        System.out.println("=== Affichage des départements ===");
        departements.displayDepartement();

        System.out.println("\nRecherche nom 'Marketing' : " + departements.rechercherDepartement("Marketing"));
        System.out.println("Recherche objet d2 : " + departements.rechercherDepartement(d2));

        departements.supprimerDepartement(d2);
        System.out.println("\nAprès suppression de d2 :");
        departements.displayDepartement();

        System.out.println("\nTri par ID (TreeSet) :");
        TreeSet<Departement> sorted = departements.trierDepartementById();
        sorted.forEach(System.out::println);
    }
}
