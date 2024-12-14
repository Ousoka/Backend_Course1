package sn.ousoka.First_Project;

import java.util.ArrayList;
import java.util.List;

public class School {

    private String nom; 
    private List<Dresseur> dresseurs; 

    public School(String nom) {
        this.nom = nom;
        this.dresseurs = new ArrayList<>();
    }

    public void former(Dresseur dresseur) {
        this.dresseurs.add(dresseur);
    }

    // Dans dresseur.java
    // public void ajouterAnimal(Animal animal) {
    //     animauxDresses.add(animal);
    // }
    public void entrainer(Dresseur dresseur, Animal animal) {
        dresseur.ajouterAnimal(animal);
    }

    public List<Dresseur> getListeDresseurs() {
        return dresseurs;
    }

    public String afficherDresseurs() {
        if (dresseurs.isEmpty()) {
            return "Aucun dresseur dans l'école.";
        }

        String result = "Les dresseurs de l'école" + nom + "sont : ";
        for (int i = 0; i < dresseurs.size(); i++) {
            Dresseur dresseur = dresseurs.get(i);
            result += dresseur.getPrenom() + " " + dresseur.getNom();
            if (i < dresseurs.size() - 1) {
                result += ", ";
            }
        }

        result += ".";
        return result;
    }
}
