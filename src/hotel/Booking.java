package hotel;
import java.time.LocalDate;

public class Booking {

    private Room room;
    private Customer customer;
    private LocalDate checkInDate;
    private LocalDate checkOutDate;
    private boolean isPaid;

    public Booking(Room room, Customer customer, LocalDate checkInDate, LocalDate checkOutDate) {
        this.room = room;
        this.customer = customer;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
        this.isPaid = false;
        this.room.bookRoom();
    }

    //-------------- G & S --------------------------------------------------------------
    public Room getRoom() {return room;}
    public void setRoom(Room room) {this.room = room;}
    public Customer getCustomer() {return customer;}
    public void setCustomer(Customer customer) {this.customer = customer;}
    public LocalDate getCheckInDate() {return checkInDate;}
    public void setCheckInDate(LocalDate checkInDate) {this.checkInDate = checkInDate;}
    public LocalDate getCheckOutDate() {return checkOutDate;}
    public void setCheckOutDate(LocalDate checkOutDate) {this.checkOutDate = checkOutDate;}
    public boolean isPaid() {return isPaid;}
    public void setPaid(boolean paid) {isPaid = paid;}

    //-------------- METHODS --------------------------------------------------------------
    public void makePayment() {
        if (!isPaid) {
            isPaid = true;
            System.out.println("You have successfully paid the booking for room: " + room.getRoomNr());
        } else {
            System.out.println("Already paid for");
        }
    }
    public int getNights () {
     return checkInDate.getDayOfYear() - checkOutDate.getDayOfYear();
    }
    public void displayBookingDetails() {
        System.out.println(
                "Booking: " +
                "\nCheckInDate: " + checkInDate +
                "\nCheckOutDate: " + checkOutDate +
                "\nCustomer: " + customer +
                "\nRoom: " + room);
    }
    public double getTotalPrice() {
        double totalPrice = room.calculatePricePerNight(getNights());
        if(getNights() > 5){
            totalPrice = totalPrice * 0.9;
        } else {
            System.out.println("No discount");
        }
        return totalPrice;
    }


}
