package com.example;

public class Animal {

    protected Long id;
    protected String nom;
    protected String categorie;
    protected Personne proprietaire;

    protected Long getId() {
        return id;
    }

    protected void setId(Long id) {
        this.id = id;
    }

    protected String getNom() {
        return nom;
    }

    protected void setNom(String nom) {
        this.nom = nom;
    }

    protected String getCategorie() {
        return categorie;
    }

    protected void setCategorie(String categorie) {
        this.categorie = categorie;
    }

    protected Personne getProprietaire() {
        return proprietaire;
    }

    protected void setProprietaire(Personne proprietaire) {
        this.proprietaire = proprietaire;
    }

    protected String crier() {
        return "Cri de l'animal : Je ";
    }

    protected String seDeplacer() {
        return "Deplacement de l'animal : Je ";
    }

    protected String sePresenter() {
        return "Presentation de l'animal: Je suis un ";
    }

    protected String attaquer(Animal autreAnimal) {
        return this.getNom() + " (le " + this.getCategorie() + " de " + this.getProprietaire() + ") a attaqué et dévoré "
                + autreAnimal.getNom() + " (le " + autreAnimal.getCategorie() + " de " + autreAnimal.getProprietaire() + ").";
    }

}
