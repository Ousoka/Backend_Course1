package com.example;

public class Pigeon extends Animal {

    //Constructeur
    public Pigeon(String nom, String categorie) {
        this.nom = nom;
        this.categorie = categorie;
    }

    public String crier() {
        return super.crier()+"roucoule";
    }

    public String seDeplacer() {
        return super.seDeplacer()+"vole";
    }

    public String sePresenter() {
        return super.sePresenter() + "pigeon, plus precisemment un "+ this.getCategorie() + " et je me nomme " + this.getNom();
    }

}
