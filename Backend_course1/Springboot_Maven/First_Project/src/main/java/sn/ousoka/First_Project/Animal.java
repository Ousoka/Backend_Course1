package sn.ousoka.First_Project;

public class Animal {

    private Long id;
    private String nom;
    private int age;
    private String race;
    private Proprietaire proprietaire;

    public Animal(Long id, String nom, int age, String race, Proprietaire proprietaire) {
        this.id = id;
        this.nom = nom;
        this.age = age;
        this.race = race;
        this.proprietaire = proprietaire;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public Proprietaire getProprietaire() {
        return proprietaire;
    }

    public void setProprietaire(Proprietaire proprietaire) {
        this.proprietaire = proprietaire;
    }

    // Methods
    public String crier() {
        return "L'animal fait un cri.";
    }

    public String seDeplacer() {
        return "L'animal se déplace.";
    }

    public String sePresenter() {
        return "Je suis un " + race + " nommé " + nom + ", âgé de " + age + " ans.";
    }
}
