package summer_Assignment_25114FW001.Day_28;

import java.util.*;

// Write a program to Create ticket booking system.

class Event {
    private int eventId;
    private String eventName;
    private String date;
    private String venue;
    private int totalSeats;
    private int availableSeats;
    private double ticketPrice;

    public Event(int eventId, String eventName, String date, String venue, int totalSeats, double ticketPrice) {
        this.eventId = eventId;
        this.eventName = eventName;
        this.date = date;
        this.venue = venue;
        this.totalSeats = totalSeats;
        this.availableSeats = totalSeats;
        this.ticketPrice = ticketPrice;
    }

    public int getEventId() { return eventId; }
    public void setEventId(int eventId) { this.eventId = eventId; }
    public String getEventName() { return eventName; }
    public String getDate() { return date; }
    public String getVenue() { return venue; }
    public int getAvailableSeats() { return availableSeats; }
    public double getTicketPrice() { return ticketPrice; }

    public boolean bookSeat() {
        if (availableSeats <= 0) {
            System.out.println("No seats available for this event");
            return false;
        }
        availableSeats--;
        return true;
    }

    public void cancelSeat() {
        if (availableSeats < totalSeats) {
            availableSeats++;
        }
    }

    @Override
    public String toString() {
        return "Event ID: " + eventId + " | " + eventName + " | Date: " + date +
                " | Venue: " + venue + " | Available Seats: " + availableSeats +
                " | Price: ₹" + String.format("%.2f", ticketPrice);
    }
}

class Booking {
    private int bookingId;
    private int eventId;
    private String eventName;
    private String customerName;

    public Booking(int bookingId, int eventId, String eventName, String customerName) {
        this.bookingId = bookingId;
        this.eventId = eventId;
        this.eventName = eventName;
        this.customerName = customerName;
    }

    public int getBookingId() { return bookingId; }
    public int getEventId() { return eventId; }

    @Override
    public String toString() {
        return "Booking ID: " + bookingId + " | Event: " + eventName +
                " | Customer: " + customerName + " | Event ID: " + eventId;
    }
}

class TicketSystem {
    // Use LinkedHashMap so events/bookings print in the order they were added.
    private LinkedHashMap<Integer, Event> events;
    private LinkedHashMap<Integer, Booking> bookings;
    private int eventIdCounter;
    private int bookingIdCounter;
    private final String EVENT_NOT_FOUND = "Event not found";
    private final String BOOKING_NOT_FOUND = "Booking not found";

    public TicketSystem() {
        events = new LinkedHashMap<>();
        bookings = new LinkedHashMap<>();
        eventIdCounter = 1;
        bookingIdCounter = 1;
    }

    // Builds the Event itself, so the real ID is always baked in correctly.
    public int addEvent(String eventName, String date, String venue, int totalSeats, double ticketPrice) {
        int newId = eventIdCounter;
        Event event = new Event(newId, eventName, date, venue, totalSeats, ticketPrice);
        events.put(newId, event);
        eventIdCounter++;
        return newId;
    }

    public void bookTicket(int eventId, String customerName) {
        if (!events.containsKey(eventId)) {
            System.out.println(EVENT_NOT_FOUND);
            return;
        }
        Event event = events.get(eventId);
        if (event.bookSeat()) {
            Booking booking = new Booking(bookingIdCounter, eventId, event.getEventName(), customerName);
            bookings.put(bookingIdCounter, booking);
            System.out.println("Ticket booked successfully! Your booking ID is " + bookingIdCounter);
            bookingIdCounter++;
        }
    }

    public void cancelTicket(int bookingId) {
        if (!bookings.containsKey(bookingId)) {
            System.out.println(BOOKING_NOT_FOUND);
            return;
        }
        Booking booking = bookings.get(bookingId);
        events.get(booking.getEventId()).cancelSeat();
        bookings.remove(bookingId);
        System.out.println("Booking cancelled successfully");
    }

    public void showEvents() {
        if (events.isEmpty()) {
            System.out.println("No events available");
            return;
        }
        System.out.println("--- Available Events ---");
        for (int i : events.keySet()) {
            System.out.println(events.get(i));
        }
        System.out.println("--- End ---");
    }

    public void showBookings() {
        if (bookings.isEmpty()) {
            System.out.println("No bookings found");
            return;
        }
        System.out.println("--- All Bookings ---");
        for (int i : bookings.keySet()) {
            System.out.println(bookings.get(i));
        }
        System.out.println("--- End ---");
    }
}

public class Question_111 {

    // Reads a line and parses it as an int; keeps asking until valid.
    private static int readInt(Scanner sc, String prompt) {
        while (true) {
            System.out.print(prompt);
            String line = sc.nextLine().trim();
            try {
                return Integer.parseInt(line);
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid whole number.");
            }
        }
    }

    // Reads a line and parses it as a double; keeps asking until valid.
    private static double readDouble(Scanner sc, String prompt) {
        while (true) {
            System.out.print(prompt);
            String line = sc.nextLine().trim();
            try {
                return Double.parseDouble(line);
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid number.");
            }
        }
    }

    // Reads a non-empty line of text; keeps asking until something is typed.
    private static String readNonEmpty(Scanner sc, String prompt) {
        while (true) {
            System.out.print(prompt);
            String line = sc.nextLine().trim();
            if (!line.isEmpty()) {
                return line;
            }
            System.out.println("This field cannot be empty.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TicketSystem ts = new TicketSystem();

        while (true) {
            System.out.println("\n--- Ticket Booking Menu ---");
            System.out.println("1. Add Event");
            System.out.println("2. Book Ticket");
            System.out.println("3. Cancel Ticket");
            System.out.println("4. Show Available Events");
            System.out.println("5. Show All Bookings");
            System.out.println("6. Exit");

            int choice = readInt(sc, "Choice: ");

            switch (choice) {
                case 1 -> {
                    String eventName = readNonEmpty(sc, "Event Name: ");
                    String date = readNonEmpty(sc, "Date (DD/MM/YYYY): ");
                    String venue = readNonEmpty(sc, "Venue: ");

                    int totalSeats;
                    while (true) {
                        totalSeats = readInt(sc, "Total Seats: ");
                        if (totalSeats > 0) break;
                        System.out.println("Total seats must be greater than 0.");
                    }

                    double ticketPrice;
                    while (true) {
                        ticketPrice = readDouble(sc, "Ticket Price: ");
                        if (ticketPrice >= 0) break;
                        System.out.println("Ticket price cannot be negative.");
                    }

                    int newId = ts.addEvent(eventName, date, venue, totalSeats, ticketPrice);
                    System.out.println("Event added successfully! Event ID is " + newId);
                }
                case 2 -> {
                    int eventId = readInt(sc, "Enter Event ID: ");
                    String customerName = readNonEmpty(sc, "Enter your name: ");
                    ts.bookTicket(eventId, customerName);
                }
                case 3 -> {
                    int bookingId = readInt(sc, "Enter Booking ID: ");
                    ts.cancelTicket(bookingId);
                }
                case 4 -> ts.showEvents();
                case 5 -> ts.showBookings();
                case 6 -> {
                    System.out.println("Goodbye!");
                    sc.close();
                    return;
                }
                default -> System.out.println("Invalid choice.");
            }
        }
    }
}