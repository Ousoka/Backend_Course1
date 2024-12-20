package sn.ousoka.GestionFile.service;

import sn.ousoka.GestionFile.model.Service;
import sn.ousoka.GestionFile.model.Localisation;
import sn.ousoka.GestionFile.model.ETicket;
import sn.ousoka.GestionFile.model.QueueStatus;

import java.util.ArrayList;
import java.util.List;

public class ServiceGestionFile {

    private List<ETicket> ticketQueue;  // Assuming a list of tickets in the queue

    // Method to get a list of all tickets
    public List<ETicket> getAllTickets() {
        return ticketQueue;
    }
    // Constructor and other methods

    // public ETicket getCurrentTicket() {
    //     return tickets.isEmpty() ? null : tickets.get(0);
    // }

    // Method to serve the next client (call the next ticket)
    public void callNextClient() {
        for (ETicket ticket : ticketQueue) {
            if (ticket.getStatus() == QueueStatus.PENDING) {
                ticket.setStatus(QueueStatus.IN_PROGRESS);
                break;  // Call only one client at a time
            }
        }
    }

    // Method to mark a client as completed after being served
    public void completeClient(ETicket ticket) {
        if (ticket.getStatus() == QueueStatus.IN_PROGRESS) {
            ticket.setStatus(QueueStatus.COMPLETED);
        }
    }


    // public List<QueueStatus> getAllQueueStatuses() {
    //     // Returns all queues' statuses
    // }
}
