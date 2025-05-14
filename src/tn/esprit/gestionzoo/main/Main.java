package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.AffectationHashMap;
import tn.esprit.gestionzoo.entities.Departement;
import tn.esprit.gestionzoo.entities.Employe;

import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        // Create employees
        Employe emp1 = new Employe(1, "Doe", "John", "IT", 3);
        Employe emp2 = new Employe(2, "Smith", "Jane", "HR", 2);
        Employe emp3 = new Employe(3, "Brown", "Bob", "Finance", 4);

        // Create departments
        Departement dept1 = new Departement(101, "IT", 50);
        Departement dept2 = new Departement(102, "HR", 30);
        Departement dept3 = new Departement(103, "Finance", 20);

        // Create AffectationHashMap
        AffectationHashMap affectations = new AffectationHashMap();

        // Add employees to departments
        affectations.ajouterEmployeDepartement(emp1, dept1);
        affectations.ajouterEmployeDepartement(emp2, dept2);
        affectations.ajouterEmployeDepartement(emp3, dept3);

        // Test adding same employee to different department (Instruction 3 test)
        System.out.println("\nTentative d'ajouter le même employé à un autre département:");
        affectations.ajouterEmployeDepartement(emp1, dept2);

        // Display all assignments
        System.out.println("\nAffichage des affectations:");
        affectations.afficherEmployesEtDepartements();

        // Test removing employee (Instruction 4)
        System.out.println("\nSuppression d'un employé:");
        affectations.supprimerEmploye(emp2);
        affectations.afficherEmployesEtDepartements();

        // Test removing employee from specific department (Instruction 5)
        System.out.println("\nSuppression d'un employé d'un département spécifique:");
        affectations.supprimerEmployeEtDepartement(emp3, dept3);
        affectations.afficherEmployesEtDepartements();

        // Test displaying employees and departments separately (Instructions 6-7)
        System.out.println("\nAffichage des employés:");
        affectations.afficherEmployes();

        System.out.println("\nAffichage des départements:");
        affectations.afficherDepartements();

        // Test searching (Instructions 8-9)
        System.out.println("\nRecherche d'employé existant: " + affectations.rechercherEmploye(emp1));
        System.out.println("Recherche de département existant: " + affectations.rechercherDepartement(dept1));

        // Test sorting (Instruction 10)
        System.out.println("\nAffichage trié des employés:");
        TreeMap<Employe, Departement> sortedMap = affectations.trierMap();
        sortedMap.forEach((e, d) -> System.out.println("Employé: " + e + " | Département: " + d));
    }
}