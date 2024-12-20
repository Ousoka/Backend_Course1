package sn.ousoka.GestionFile;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import sn.ousoka.GestionFile.config.GestionFileConfiguration;
import sn.ousoka.GestionFile.model.Service;
import sn.ousoka.GestionFile.model.ETicket;
import sn.ousoka.GestionFile.model.Localisation;

import java.util.List;

@SpringBootApplication
public class GestionFileApplication implements CommandLineRunner {

    private final List<ETicket> tickets;
    private final List<Service> services;
    private final List<Localisation> localisations;

    // Constructor injection of beans
    public GestionFileApplication(List<ETicket> tickets, List<Service> services, List<Localisation> localisations) {
        this.tickets = tickets;
        this.services = services;
        this.localisations = localisations;
    }

    public static void main(String[] args) {
        SpringApplication.run(GestionFileApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        // Print out all the tickets
        System.out.println("Initial Tickets:");
        for (ETicket ticket : tickets) {
            System.out.println("Ticket ID: " + ticket.getId() + ", Service: " + ticket.getLocalisation().getService().getNom() + ", Position: " + ticket.getPosition());
        }

        // Print out all the services
        System.out.println("\nAvailable Services:");
        for (Service service : services) {
            System.out.println("Service Name: " + service.getNom() + ", Description: " + service.getDescription());
        }

        // Print out all the localisations
        System.out.println("\nAvailable Localisations:");
        for (Localisation localisation : localisations) {
            System.out.println("Localisation Name: " + localisation.getNom() + ", Coordinates: " + localisation.getCoordonnees());
        }
    }
}
