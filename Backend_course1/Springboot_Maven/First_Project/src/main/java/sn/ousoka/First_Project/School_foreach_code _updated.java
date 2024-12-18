package sn.ousoka.First_Project;

import sn.ousoka.First_Project.*;
import java.util.List;

public class School {
    private String nom;
    private int id;
    private List<Dresseur> listDresseur;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Dresseur> getListDresseur() {
        return listDresseur;
    }

    public void setListDresseur(List<Dresseur> listDresseur) {
        this.listDresseur = listDresseur;
    }

    private String afficherListDresseur() {
        // Initialize the custom AtomicReference with an empty string
        AtomicReference result = new AtomicReference("");

        // Use forEach to append each Dresseur's name
        this.listDresseur.forEach(dresseur -> {
            result.append(dresseur.getNom());
        });

        // Return the final concatenated string, trimmed to remove leading spaces
        return result.get().trim();
    }

    public void former() {
        System.out.println("Je forme les dresseurs: " + afficherListDresseur());
    }

    public void entrainer() {
        // Training logic can be implemented here
    }
}
