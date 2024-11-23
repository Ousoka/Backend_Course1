package com.example;

public class Serpent extends Animal {

    //Constructeur
    public Serpent(String nom, String categorie) {
        this.nom = nom;
        this.categorie = categorie;
    }

    public String crier() {
        return super.crier()+"sifflote";
    }

    public String seDeplacer() {
        return super.seDeplacer()+"rampe";
    }

    public String sePresenter() {
        return super.sePresenter() + "serpent, plus precisemment un "+ this.getCategorie() + " et je me nomme " + this.getNom();
    }

}
