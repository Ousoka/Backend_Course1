package sn.ousoka.First_Project.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import sn.ousoka.First_Project.*;

@Configuration
public class FirstProjectConfiguration {

    // Bean for Dresseur
    @Bean
    public Dresseur dresseur1() {
        return new Dresseur("Doe", "John");
    }

    @Bean
    public Dresseur dresseur2() {
        return new Dresseur("Smith", "Anna");
    }

    // Bean for Proprietaire
    @Bean
    public Proprietaire proprietaire1() {
        Animal lion = new Lion(1L, "Simba", 5, "Lion", null); // Assuming null for proprietaire for simplicity
        return new Proprietaire("Doe", "John", lion);
    }

    @Bean
    public Proprietaire proprietaire2() {
        Animal elephant = new Elephant(2L, "Dumbo", 4, "Elephant", null);
        return new Proprietaire("Smith", "Anna", elephant);
    }

    // Bean for Animal (Lion, Tigre, Elephant)
    @Bean
    public Animal lion() {
        return new Lion(1L, "Simba", 5, "Lion", null);  // Example of Lion instantiation
    }

    @Bean
    public Animal tigre() {
        return new Tigre(2L, "Sher Khan", 6, "Tigre", null);  // Example of Tigre instantiation
    }

    @Bean
    public Animal elephant() {
        return new Elephant(3L, "Dumbo", 4, "Elephant", null);  // Example of Elephant instantiation
    }

    // Bean for School
    @Bean
    public School school() {
        return new School("École des Dresseurs");
    }

    // Bean for Zoo
    @Bean
    public Zoo zoo() {
        return new Zoo(1L, "Dakar");
    }
}
