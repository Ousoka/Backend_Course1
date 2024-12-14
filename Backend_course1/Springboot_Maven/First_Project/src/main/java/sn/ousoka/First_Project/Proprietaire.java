package sn.ousoka.First_Project;

public class Proprietaire extends Personne {

    private Animal animal;

    public Proprietaire(String nom, String prenom, Animal animal) {
        super(nom, prenom);
        this.animal = animal;
    }

    public Animal getAnimal() {
        return animal;

    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    @Override
    public String sePresenter() {
        return "Je suis " + getPrenom() + " " + getNom() + ", et je possède un " + animal.getRace() + " nommé " + animal.getNom() + ".";
    }
}
