package com.example;

public class Personne {

    private String nom;
    private String prenom;
    private Animal animal;

    public Personne(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
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

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    //Presentation
    public String sePresenter() {
        return "Je suis " + this.prenom + " " + this.nom + ", et mon animal s'appelle " + animal.getNom() + ".";
    }

    public String toString() {
        return this.prenom + " " + this.nom;
    }

}
