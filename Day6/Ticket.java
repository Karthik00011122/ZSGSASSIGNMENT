package travel.booking;

public class Ticket 
{
    private String ticketId;
    private String destination;
    private double fare;

    public Ticket(String ticketId, String destination, double fare) 
	{
        this.ticketId = ticketId;
        this.destination = destination;
        this.fare = fare;
    }

    public void displayTicket() 
	{
        System.out.println("Ticket ID     : " + ticketId);
        System.out.println("Destination   : " + destination);
        System.out.println("Fare          : " + fare);
    }
}
