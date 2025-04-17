package tn.esprit.gestionzoo.entities;

public class Departement implements Comparable<Departement> {
    private int id;
    private String nomDepartement;
    private int nbEmployes;

    public Departement() {}

    public Departement(int id, String nomDepartement, int nbEmployes) {
        this.id = id;
        this.nomDepartement = nomDepartement;
        this.nbEmployes = nbEmployes;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getNomDepartement() { return nomDepartement; }
    public void setNomDepartement(String nomDepartement) { this.nomDepartement = nomDepartement; }

    public int getNbEmployes() { return nbEmployes; }
    public void setNbEmployes(int nbEmployes) { this.nbEmployes = nbEmployes; }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Departement that = (Departement) obj;
        return id == that.id && nomDepartement.equals(that.nomDepartement);
    }

    @Override
    public int hashCode() {
        return id * 31 + nomDepartement.hashCode();
    }

    @Override
    public String toString() {
        return "Departement{" +
                "id=" + id +
                ", nomDepartement='" + nomDepartement + '\'' +
                ", nbEmployes=" + nbEmployes +
                '}';
    }

    @Override
    public int compareTo(Departement o) {
        return Integer.compare(this.id, o.id);
    }
}
