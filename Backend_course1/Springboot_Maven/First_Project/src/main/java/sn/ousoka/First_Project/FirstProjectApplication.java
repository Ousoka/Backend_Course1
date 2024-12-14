package sn.ousoka.First_Project;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.beans.factory.annotation.Autowired;

@SpringBootApplication
public class FirstProjectApplication implements CommandLineRunner {

    @Autowired
    private Dresseur dresseur1;
    @Autowired
    private Dresseur dresseur2;
    @Autowired
    private Proprietaire proprietaire1;
    @Autowired
    private Proprietaire proprietaire2;
    @Autowired
    private Animal lion;
    @Autowired
    private Animal tigre;
    @Autowired
    private Animal elephant;
    @Autowired
    private School school;
    @Autowired
    private Zoo zoo;

    public static void main(String[] args) {
        SpringApplication.run(FirstProjectApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Dresseur 1: " + dresseur1.sePresenter());
        System.out.println("Dresseur 2: " + dresseur2.sePresenter());
        System.out.println("Proprietaire 1: " + proprietaire1.sePresenter());
        System.out.println("Proprietaire 2: " + proprietaire2.sePresenter());
        
        System.out.println("Lion: " + lion.sePresenter());
        System.out.println("Tigre: " + tigre.sePresenter());
        System.out.println("Elephant: " + elephant.sePresenter());
        
        System.out.println("School: " + school.afficherDresseurs());
        System.out.println("Zoo: " + zoo.afficherZoo());
    }
}
