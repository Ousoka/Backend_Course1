// package sn.ousoka.GestionFile.service;

// import sn.ousoka.GestionFile.model.Service;
// import sn.ousoka.GestionFile.model.Localisation;
// import sn.ousoka.GestionFile.model.ETicket;

// import java.util.ArrayList;
// import java.util.List;

// public class ServiceGestionFile {

//     // This list will store all the tickets (in a real application, you would probably use a database)
//     private List<ETicket> tickets;

//     // Constructor
//     public ServiceGestionFile() {
//         this.tickets = new ArrayList<>();
//     }

//     // Method to generate a new ticket
//     public ETicket generateTicket(Localisation localisation) {
//         int nextTicketId = tickets.size() + 1;  // For simplicity, using the size of the list as the ticket ID
//         int positionInQueue = tickets.size() + 1; // The next position is the last size of the list + 1
//         ETicket ticket = new ETicket(nextTicketId, positionInQueue, "Waiting", localisation);
//         tickets.add(ticket);
//         return ticket;
//     }

//     // Method to get the current position of a ticket
//     public ETicket getTicketById(int ticketId) {
//         for (ETicket ticket : tickets) {
//             if (ticket.getId() == ticketId) {
//                 return ticket;
//             }
//         }
//         return null; // If no ticket is found with the given ID
//     }

//     // Method to update the status of a ticket (e.g., move it to 'Being Processed')
//     public void updateTicketStatus(int ticketId, String newStatus) {
//         ETicket ticket = getTicketById(ticketId);
//         if (ticket != null) {
//             ticket.setStatus(newStatus);
//         }
//     }

//     // Method to simulate calling the next ticket in the queue
//     public void callNextTicket() {
//         if (tickets.isEmpty()) {
//             System.out.println("No tickets in the queue.");
//             return;
//         }
//         ETicket nextTicket = tickets.get(0);  // Get the first ticket in the queue
//         updateTicketStatus(nextTicket.getId(), "Being Processed");
//         System.out.println("Now processing ticket ID: " + nextTicket.getId());
//         // Remove the ticket after it's processed (you can change this if you want to keep the processed tickets)
//         tickets.remove(0);
//     }

//     // Method to get the current queue status
//     public List<ETicket> getQueueStatus() {
//         return new ArrayList<>(tickets);
//     }
// }
