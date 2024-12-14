package sn.ousoka.First_Project;

public class Elephant extends Animal {

    public Elephant(Long id, String nom, int age, String race, Proprietaire proprietaire
    ) {
        super(id, nom, age, race, proprietaire
        );
    }

    @Override
    public String crier() {
        return "Barrisement!";
    }

    @Override
    public String seDeplacer() {
        return "Je cours!";
    }
}
