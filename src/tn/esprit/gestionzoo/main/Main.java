package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.Employe;
import tn.esprit.gestionzoo.entities.SocieteArrayList;

public class Main {
    public static void main(String[] args) {
        SocieteArrayList societe = new SocieteArrayList();

        Employe e1 = new Employe(1, "Ahmed", "Ben Ali", "Informatique", 3);
        Employe e2 = new Employe(2, "Noura", "Mehdi", "Marketing", 2);
        Employe e3 = new Employe(3, "Karim", "Trabelsi", "Informatique", 5);
        Employe e4 = new Employe(4, "Sami", "Haddad", "Comptabilité", 1);


        societe.ajouterEmploye(e1);
        societe.ajouterEmploye(e2);
        societe.ajouterEmploye(e3);
        societe.ajouterEmploye(e4);

        System.out.println("=== Employés ajoutés ===");
        societe.displayEmploye();

        System.out.println("\nRecherche par nom 'Karim' : " + societe.rechercherEmploye("Karim"));

        System.out.println("Recherche de e2 : " + societe.rechercherEmploye(e2));

        societe.supprimerEmploye(e4);
        System.out.println("\nAprès suppression de Sami :");
        societe.displayEmploye();

        societe.trierEmployeParId();
        System.out.println("\nTri par ID :");
        societe.displayEmploye();

        societe.trierEmployeParNomDépartementEtGrade();
        System.out.println("\nTri par Département + Grade :");
        societe.displayEmploye();
    }
}
