package com.example;

public class Chat extends Animal {

    //Constructeur
    public Chat(String nom, String categorie) {
        this.nom = nom;
        this.categorie = categorie;
    }

    public String crier() {
        return super.crier() + "miole";
    }

    public String seDeplacer() {
        return super.seDeplacer() + "marche";
    }

    public String sePresenter() {
        return super.sePresenter() + "chat, plus precisemment un "+ this.getCategorie() + " et je me nomme " + this.getNom();
    }

}
