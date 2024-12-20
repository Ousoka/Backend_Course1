package sn.ousoka.GestionFile.model;

public enum QueueStatus {
    PENDING,       // Ticket is waiting in the queue
    IN_PROGRESS,   // Ticket is currently being served
    COMPLETED      // Ticket has been processed and served
}
