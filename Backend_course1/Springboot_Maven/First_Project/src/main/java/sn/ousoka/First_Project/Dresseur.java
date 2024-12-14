package sn.ousoka.First_Project;

import java.util.ArrayList;
import java.util.List;

public class Dresseur extends Personne {

    private List<Animal> animauxDresses;

    public Dresseur(String nom, String prenom) {
        super(nom, prenom);
        this.animauxDresses = new ArrayList<>();
    }

    public void ajouterAnimal(Animal animal) {
        animauxDresses.add(animal);
    }

    public void retirerAnimal(Animal animal) {
        animauxDresses.remove(animal);
    }

    public List<Animal> getAnimauxDresses() {
        return animauxDresses;
    }

    @Override
    public String sePresenter() {
        return "Je suis " + getPrenom() + " " + getNom() + ", un dresseur d'animaux.";
    }

    public String afficherAnimauxDresses() {
        if (animauxDresses.isEmpty()) {
            return "Je n'ai pas encore dressé d'animaux.";
        }

        String result = "J'ai dressé les animaux suivants : ";
        for (int i = 0; i < animauxDresses.size(); i++) {
            Animal animal = animauxDresses.get(i);
            result += animal.getNom() + " (" + animal.getRace() + ")";
            if (i < animauxDresses.size() - 1) {
                result += ", ";
            }
        }
        result += ".";
        return result;
    }
}
