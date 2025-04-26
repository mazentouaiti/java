package tn.esprit.gestionzoo.entities;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class AffectationHashMap {
    private final HashMap<Employe, Departement> affectations;

    public AffectationHashMap() {
        this.affectations = new HashMap<>();
    }

    // Instruction 2: Add employee to department
    public void ajouterEmployeDepartement(Employe e, Departement d) {
        if (!affectations.containsKey(e)) {
            affectations.put(e, d);
        } else {
            System.out.println("L'employé " + e.getNom() + " est déjà affecté à un département.");
        }
    }

    // Instruction 3: Display all employees and their departments
    public void afficherEmployesEtDepartements() {
        System.out.println("Liste des affectations employé-département:");
        for (Map.Entry<Employe, Departement> entry : affectations.entrySet()) {
            System.out.println("Employé: " + entry.getKey() + " | Département: " + entry.getValue());
        }
    }

    // Instruction 4: Remove an employee
    public void supprimerEmploye(Employe e) {
        if (affectations.containsKey(e)) {
            affectations.remove(e);
            System.out.println("Employé " + e.getNom() + " supprimé avec succès.");
        } else {
            System.out.println("Employé non trouvé.");
        }
    }

    // Instruction 5: Remove an employee from a specific department
    public void supprimerEmployeEtDepartement(Employe e, Departement d) {
        if (affectations.containsKey(e) && affectations.get(e).equals(d)) {
            affectations.remove(e);
            System.out.println("Employé " + e.getNom() + " supprimé du département " + d.getNomDepartement());
        } else {
            System.out.println("Aucune affectation correspondante trouvée.");
        }
    }

    // Instruction 6: Display all employees
    public void afficherEmployes() {
        System.out.println("Liste des employés:");
        for (Employe e : affectations.keySet()) {
            System.out.println(e);
        }
    }

    // Instruction 7: Display all departments
    public void afficherDepartements() {
        System.out.println("Liste des départements:");
        Set<Departement> departements = (Set<Departement>) affectations.values();
        for (Departement d : departements) {
            System.out.println(d);
        }
    }

    // Instruction 8: Search for an employee
    public boolean rechercherEmploye(Employe e) {
        return affectations.containsKey(e);
    }

    // Instruction 9: Search for a department
    public boolean rechercherDepartement(Departement d) {
        return affectations.containsValue(d);
    }

    // Instruction 10: Return a sorted TreeMap by employee ID
    public TreeMap<Employe, Departement> trierMap() {
        return new TreeMap<>(affectations);
    }
}