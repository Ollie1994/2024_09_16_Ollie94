package hotel;
public class Room {
    // Room: basklassen, innehålla alla egenskaper och beetende som alla rum har gemensamt
    // StandardRoom och Suite: underklasser till Room + sina egna unika egenskaper
    // BookingService: hantera bokningar, tillgänglihet m.m.
    // markera man klassen abstract då kan man undvika att det går att skapa ett objekt av klassen.
    BookingService bookingService = new BookingService();

    private String roomNr;
    private int capacity;
    private boolean isBooked;
    private double pricePerNight;

    // konstruktorn
    public Room(String roomNr, int capacity, double pricePerNight) { //lägger till double pricePerNight
        this.roomNr = roomNr;
        this.capacity = capacity;
        this.pricePerNight = pricePerNight;
        // standard värde
        this.isBooked = false;
    }

    // metod för att boka rum
    public void bookRoom(int nights) {
        if(!isBooked  && roomNr.equals("101")) {
            bookingService.calculatePricePerNight(nights, 1000);
            isBooked = true;
            System.out.println("Room " + roomNr + " is now booked.");
        } else if (!isBooked && roomNr.equals("201")) {
            bookingService.calculatePricePerNight(nights, 5000);
            isBooked = true;
            System.out.println("Room " + roomNr + " is now booked.");
        }
        else {
            System.out.println("Room " + roomNr + " is already booked.");
        }
    }

    // metod för att avboka rummet
    public void cancelBooking() {
        if (isBooked) {
            isBooked = false;
            System.out.println("The booking for room " + roomNr + " is cancelled.");
        } else {
            System.out.println("Room " + roomNr + " is not booked.");
        }
    }
    // metod för att visa detaljer om rummet

    /*@Override
    public String toString() {
        return "Room{" +
                "roomNr='" + roomNr + '\'' +
                ", capacity=" + capacity +
                ", isBooked=" + isBooked +
                '}';
    }*/

    public void displayRoomDetails() {
        System.out.println("Room " + roomNr + " with capacity of " + capacity + " guests.");
    }


// GETTERS OCH SETTERS _________________________________________________________________________________
    public String getRoomNr() {
        return roomNr;
    }
    public int getCapacity() {
        return capacity;
    }
    public double getPricePerNight() {
        return pricePerNight;
    }
    public boolean isBooked() {
        return isBooked;
    }
    public void setBooked(boolean booked) {
        isBooked = booked;
    }




}



































