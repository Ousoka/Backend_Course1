package com.example;

public class Poisson extends Animal {

    //Constructeur
    public Poisson(String nom, String categorie) {
        this.nom = nom;
        this.categorie = categorie;
    }

    public String crier() {
        return super.crier()+"glougloute";
    }

    public String seDeplacer() {
        return super.seDeplacer()+"nage";
    }

    public String sePresenter() {
        return super.sePresenter() + "poisson, plus precisemment un "+ this.getCategorie() + " et je me nomme " + this.getNom();
    }

}
