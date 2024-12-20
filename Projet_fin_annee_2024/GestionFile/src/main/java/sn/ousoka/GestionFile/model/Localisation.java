package sn.ousoka.GestionFile.model;

public class Localisation {
    private String nom;
    private String coordonnees;
    private Service service;

    public Localisation() {}

    public Localisation(String nom, String coordonnees, Service service) {
        this.nom = nom;
        this.coordonnees = coordonnees;
        this.service = service;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getCoordonnees() {
        return coordonnees;
    }

    public void setCoordonnees(String coordonnees) {
        this.coordonnees = coordonnees;
    }

    public Service getService() {
        return service;
    }

    public void setService(Service service) {
        this.service = service;
    }

    @Override
    public String toString() {
        return "Localisation{" +
                "nom='" + nom + '\'' +
                ", coordonnees='" + coordonnees + '\'' +
                ", service=" + service +
                '}';
    }
}
