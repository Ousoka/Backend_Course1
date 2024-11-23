package com.example;

public class App {
    public static void main(String[] args) {

        Personne moustapha = new Personne("Ndiaye", "Mouhammadou Moustapha");
        Animal chat = new Chat("Minou", "siamois");
        moustapha.setAnimal(chat);
        chat.setProprietaire(moustapha);

        Personne sdley = new Personne("Diallo", "Souleymane");
        Animal pigeon = new Pigeon("Merlin", "pigeon voyageur");
        sdley.setAnimal(pigeon);
        pigeon.setProprietaire(sdley);

        Personne asb = new Personne("Bakhoum", "Albert Sandokh");
        Animal poisson = new Poisson("Patrick", "saumon");
        asb.setAnimal(poisson);
        poisson.setProprietaire(asb);

        Personne samou = new Personne("Diop", "Pape Moussa");
        Animal serpent = new Serpent("Diane", "cobra");
        samou.setAnimal(serpent);
        serpent.setProprietaire(samou);

        // Affichage des presentations
        System.out.println("-------------------------------");
        System.out.println(moustapha.sePresenter());
        System.out.println(moustapha.getAnimal().sePresenter());
        System.out.println(moustapha.getAnimal().crier());
        System.out.println(moustapha.getAnimal().seDeplacer());
        System.out.println("-------------------------------");
        System.out.println(sdley.sePresenter());
        System.out.println(sdley.getAnimal().sePresenter());
        System.out.println(sdley.getAnimal().crier());
        System.out.println(sdley.getAnimal().seDeplacer());
        System.out.println("-------------------------------");
        System.out.println(asb.sePresenter());
        System.out.println(asb.getAnimal().sePresenter());
        System.out.println(asb.getAnimal().crier());
        System.out.println(asb.getAnimal().seDeplacer());
        System.out.println("-------------------------------");
        System.out.println(samou.sePresenter());
        System.out.println(samou.getAnimal().sePresenter());
        System.out.println(samou.getAnimal().crier());
        System.out.println(samou.getAnimal().seDeplacer());
        System.out.println("-------------------------------");
        System.out.println("Oups ! Événement en cours...");
        System.out.println(moustapha.getAnimal().attaquer(sdley.getAnimal()));
        System.out.println("-------------------------------");


    }
}
