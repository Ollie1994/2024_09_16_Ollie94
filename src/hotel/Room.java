package hotel;
public class Room {
    private double pricePerNight;
    private int capacity;
    private String roomNr;
    private boolean isBooked;

    public Room(double pricePerNight, int capacity, String roomNr) {
        this.pricePerNight = pricePerNight;
        this.capacity = capacity;
        this.roomNr = roomNr;
        this.isBooked = false;
    }








































    //----------------------------METHODS-------------------------------------------------------------------
    public void displayRoomDetails() {
        System.out.println("Room: " + getRoomNr() + "\n Capacity: " + getCapacity());
    }


    //-------------------------- G & S -----------------------------------------------------------------
    public double getPricePerNight() {return pricePerNight;}
    public void setPricePerNight(double pricePerNight) {this.pricePerNight = pricePerNight;}
    public int getCapacity() {return capacity;}
    public void setCapacity(int capacity) {this.capacity = capacity;}
    public String getRoomNr() {return roomNr;}
    public void setRoomNr(String roomNr) {this.roomNr = roomNr;}
    public boolean isBooked() {return isBooked;}
    public void setBooked(boolean booked) {isBooked = booked;}
}



































