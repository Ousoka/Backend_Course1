package sn.ousoka.First_Project;

public class Tigre extends Animal {

    public Tigre(Long id, String nom, int age, String race, Proprietaire proprietaire
    ) {
        super(id, nom, age, race, proprietaire
        );
    }

    @Override
    public String crier() {
        return "Rugissement!";
    }

    @Override
    public String seDeplacer() {
        return "Je cours!";
    }
}
