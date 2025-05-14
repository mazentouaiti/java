package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.*;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
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

        System.out.println("\n\n===== Gestion des Étudiants =====");

        StudentManagement studentManagement = new StudentManagement();

        List<Etudiant> students = new ArrayList<>();
        students.add(new Etudiant(1, "Mohamed Ali", 22));
        students.add(new Etudiant(2, "Amina Belhadj", 20));
        students.add(new Etudiant(3, "Khalid Bouzid", 21));
        students.add(new Etudiant(4, "Leila Cherif", 23));

        System.out.println("\n1. Liste des étudiants:");
        studentManagement.displayStudents(students, s -> System.out.println("- " + s));

        System.out.println("\n2. Étudiants de plus de 21 ans:");
        studentManagement.displayStudentsByFilter(
                students,
                s -> s.getAge() > 21,
                s -> System.out.println("- " + s.getNom() + " (" + s.getAge() + " ans)")
        );

        System.out.println("\n3. Noms des étudiants:");
        String names = studentManagement.returnStudentsNames(
                students,
                s -> s.getNom() + " (" + s.getId() + ")"
        );
        System.out.println(names);

        System.out.println("\n4. Création d'un nouvel étudiant:");
        Etudiant newStudent = studentManagement.createStudent(() -> new Etudiant(5, "Youssef Hammadi", 19));
        System.out.println("Nouvel étudiant créé: " + newStudent);

        System.out.println("\n5. Étudiants triés par ID:");
        List<Etudiant> sortedStudents = studentManagement.sortStudentsById(
                students,
                Comparator.comparingInt(Etudiant::getId)
        );
        sortedStudents.forEach(System.out::println);

        System.out.println("\n6. Conversion en Stream et calcul de la moyenne d'âge:");
        double averageAge = studentManagement.convertToStream(students)
                .mapToInt(Etudiant::getAge)
                .average()
                .orElse(0);
        System.out.println("Moyenne d'âge: " + averageAge);


        System.out.println("\n===== Opérations Combinées =====");

        Departement studentDept = new Departement(200, "Formation", 100);

        Employe studentAdmin = new Employe(10, "Ben Ahmed", "Samira", "Education", 5);
        affectations.ajouterEmployeDepartement(studentAdmin, studentDept);

        System.out.println("\nAffichage final des affectations:");
        affectations.afficherEmployesEtDepartements();
    }
}