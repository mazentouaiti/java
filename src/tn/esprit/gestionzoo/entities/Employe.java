package tn.esprit.gestionzoo.entities;

public class Employe implements Comparable<Employe>{
    private int id;
    private String nom;
    private String prenom;
    private String nomDepartament;
    private int grade;

    public Employe(){}
    public Employe(int id, String nom, String prenom, String nomDepartament, int grade) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.nomDepartament = nomDepartament;
        this.grade = grade;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public String getPrenom() {
        return prenom;
    }
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    public String getNomDepartament() {
        return nomDepartament;
    }
    public void setNomDepartament(String nomDepartament) {
        this.nomDepartament = nomDepartament;
    }
    public int getGrade() {
        return grade;
    }
    public void setGrade(int grade) {
        this.grade = grade;
    }
    //equals
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Employe employe = (Employe) obj;
        return id == employe.id && nom.equals(employe.nom);
    }
    @Override
    public String toString() {
        return "Employe{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", nomDepartement='" + nomDepartament + '\'' +
                ", grade=" + grade +
                '}';
    }
    @Override
    public int compareTo(Employe o) {
        return Integer.compare(this.id, o.id);
    }
}
