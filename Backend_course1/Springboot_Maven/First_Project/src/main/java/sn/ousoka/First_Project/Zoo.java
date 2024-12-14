package sn.ousoka.First_Project;

import java.util.ArrayList;
import java.util.List;

public class Zoo {

    private Long id;
    private String ville; 
    private List<Animal> animaux;
    private List<Dresseur> dresseurs;

    public Zoo(Long id, String ville) {
        this.id = id;
        this.ville = ville;
        this.animaux = new ArrayList<>();
        this.dresseurs = new ArrayList<>();
    }

    public void ajouterAnimal(Animal animal) {
        animaux.add(animal);
    }

    public void ajouterDresseur(Dresseur dresseur) {
        dresseurs.add(dresseur);
    }

    public List<Animal> getAnimaux() {
        return animaux;
    }

    public List<Dresseur> getDresseurs() {
        return dresseurs;
    }

    public String afficherZoo() {

        String result = "Le zoo d'id "+ id +" situé à " + ville + " contient les animaux suivants :";
        for (int i = 0; i < animaux.size(); i++) {
            Animal animal = animaux.get(i);
            result += animal.getNom() + " (" + animal.getRace() + ")";
            if (i < animaux.size() - 1) {
                result += ", ";
            }
        }
        result += ".";
        return result;
    }
}
