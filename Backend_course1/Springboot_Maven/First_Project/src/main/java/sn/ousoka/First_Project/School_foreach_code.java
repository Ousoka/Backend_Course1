package sn.ousoka.First_Project;

import java.util.List;

public class School_foreach_code {
    private String nom;
    private int id;
    private List<Dresseur> listDresseur;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Dresseur> getListDresseur() {
        return listDresseur;
    }

    public void setListDresseur(List<Dresseur> listDresseur) {
        this.listDresseur = listDresseur;
    }

    private String concate(String allDresseurs, String unDresseur){
        return(allDresseurs +  " " + unDresseur);


    }

    private String afficherListDresseur() {
        // Use an array to hold the result as a workaround
        String[] result = {""};
    
        // Use forEach to concatenate names
        this.listDresseur.forEach(dresseur -> {
            result[0] = concate(result[0], dresseur.getNom());
        });
    
        // Return the final result as a string, trimmed to remove trailing spaces
        return result[0].trim();
    }    

    public void former(){System.out.println("Je forme les dresseurs" + afficherListDresseur()); }

    public void entrainer(){}
}
