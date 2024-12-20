package sn.ousoka.GestionFile.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import sn.ousoka.GestionFile.model.Service;
import sn.ousoka.GestionFile.model.Localisation;
import sn.ousoka.GestionFile.model.ETicket;
import sn.ousoka.GestionFile.service.ServiceGestionFile;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class GestionFileConfiguration {

    // Bean for Service (e.g., Seneau, Orange)
    @Bean
    public Service seneau() {
        return new Service("Seneau", "Water Service");
    }

    @Bean
    public Service orange() {
        return new Service("Orange", "Telecommunication Service");
    }

    // Bean for Localisation (e.g., locations for services)
    @Bean
    public Localisation seneauLocalisation() {
        Localisation localisation = new Localisation();
        localisation.setNom("Seneau - Dakar");
        localisation.setCoordonnees("Dakar, Senegal");
        localisation.setService(seneau());
        return localisation;
    }

    @Bean
    public Localisation orangeLocalisation() {
        Localisation localisation = new Localisation();
        localisation.setNom("Orange - Dakar");
        localisation.setCoordonnees("Dakar, Senegal");
        localisation.setService(orange());
        return localisation;
    }

    // Bean for Ticket Management Service
    @Bean
    public ServiceGestionFile serviceGestionFile() {
        return new ServiceGestionFile();
    }

    // Bean for In-Memory Ticket List (Initial Data)
    @Bean
    public List<ETicket> tickets() {
        List<ETicket> initialTickets = new ArrayList<>();
        // Create initial tickets for demonstration
        initialTickets.add(new ETicket(101, 1, "Attente", seneauLocalisation()));
        initialTickets.add(new ETicket(102, 2, "Attente", seneauLocalisation()));
        initialTickets.add(new ETicket(201, 1, "Attente", orangeLocalisation()));
        return initialTickets;
    }

    // Bean for a List of Services (e.g., Seneau, Orange)
    @Bean
    public List<Service> services() {
        List<Service> serviceList = new ArrayList<>();
        serviceList.add(seneau());
        serviceList.add(orange());
        return serviceList;
    }

    // Bean for a List of Localisations
    @Bean
    public List<Localisation> localisations() {
        List<Localisation> localisationList = new ArrayList<>();
        localisationList.add(seneauLocalisation());
        localisationList.add(orangeLocalisation());
        return localisationList;
    }
}
