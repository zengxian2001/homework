package com.train;

public class Order {
    int ticketCountOfOneWay;
    int ticketCountOfRoundTrip;

    public Order(int ticketCountOfOneWay, int ticketCountOfRoundTrip) {
        this.ticketCountOfRoundTrip = ticketCountOfRoundTrip;
        this.ticketCountOfOneWay = ticketCountOfOneWay;
    }

    public void printReceipt() {
        int totalTicketCount = ticketCountOfOneWay + ticketCountOfRoundTrip;
        int totalAmount = (ticketCountOfOneWay * Ticket.ONE_WAY_PRICE) + (ticketCountOfRoundTrip * Ticket.ROUND_TRIP_PRICE);
        System.out.println("Total tickets: " + totalTicketCount);
        System.out.println("Round-trip: " + ticketCountOfRoundTrip);
        System.out.println("Total: " + totalAmount);
    }
}
