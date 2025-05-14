package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.AffectationHashMap;
import tn.esprit.gestionzoo.entities.Departement;
import tn.esprit.gestionzoo.entities.Employe;

import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Employe emp1 = new Employe(1, "Ben Ali", "Karim", "IT", 3);
        Employe emp2 = new Employe(2, "Mazen", "Wala", "HR", 2);
        Employe emp3 = new Employe(3, "Hadi", "Amine", "Finance", 4);
        Employe emp4 = new Employe(4, "Bouzidi", "Leila", "Marketing", 1);

        Departement dept1 = new Departement(101, "IT", 50);
        Departement dept2 = new Departement(102, "HR", 30);
        Departement dept3 = new Departement(103, "Finance", 20);
        Departement dept4 = new Departement(104, "Marketing", 15);

        AffectationHashMap affectations = new AffectationHashMap();

        System.out.println("\nTentative d'ajouter des valeurs nulles:");
        affectations.ajouterEmployeDepartement(null, null);
        affectations.ajouterEmployeDepartement(emp1, null);
        affectations.ajouterEmployeDepartement(null, dept1);

        System.out.println("\nAjout des employés aux départements:");
        affectations.ajouterEmployeDepartement(emp1, dept1);
        affectations.ajouterEmployeDepartement(emp2, dept2);
        affectations.ajouterEmployeDepartement(emp3, dept3);
        affectations.ajouterEmployeDepartement(emp4, dept4);

        System.out.println("\nTentative d'ajouter le même employé à un autre département:");
        affectations.ajouterEmployeDepartement(emp1, dept2);

        System.out.println("\nAffichage des affectations:");
        affectations.afficherEmployesEtDepartements();

        System.out.println("\nSuppression d'un employé:");
        affectations.supprimerEmploye(emp2);
        affectations.afficherEmployesEtDepartements();

        System.out.println("\nSuppression d'un employé non existant:");
        affectations.supprimerEmploye(new Employe(99, "Inconnu", "N/A", "Aucun", 0));

        System.out.println("\nSuppression d'un employé d'un département spécifique:");
        affectations.supprimerEmployeEtDepartement(emp3, dept3);
        affectations.afficherEmployesEtDepartements();

        System.out.println("\nSuppression d'un employé d'un mauvais département:");
        affectations.supprimerEmployeEtDepartement(emp1, dept3);

        System.out.println("\nListe des employés:");
        affectations.afficherEmployes();

        System.out.println("\nListe des départements:");
        affectations.afficherDepartements();

        System.out.println("\nRecherche d'employé existant: " + affectations.rechercherEmploye(emp1));
        System.out.println("Recherche d'employé non existant: " +
                affectations.rechercherEmploye(new Employe(99, "Inconnu", "N/A", "Aucun", 0)));
        System.out.println("Recherche de département existant: " + affectations.rechercherDepartement(dept1));
        System.out.println("Recherche de département non existant: " +
                affectations.rechercherDepartement(new Departement(999, "Aucun", 0)));

        System.out.println("\nAffichage trié des employés:");
        TreeMap<Employe, Departement> sortedMap = affectations.trierMap();
        sortedMap.forEach((e, d) -> System.out.println("Employé: " + e + " | Département: " + d));

        System.out.println("\nTest avec une map vide:");
        AffectationHashMap emptyMap = new AffectationHashMap();
        emptyMap.afficherEmployesEtDepartements();
        emptyMap.afficherEmployes();
        emptyMap.afficherDepartements();
        System.out.println("Recherche dans une map vide: " + emptyMap.rechercherEmploye(emp1));
    }
}