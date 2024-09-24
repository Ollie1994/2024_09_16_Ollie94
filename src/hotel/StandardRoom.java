package hotel;

public class StandardRoom extends Room {

    private boolean hasTv;

    public StandardRoom(double pricePerNight, int capacity, String roomNr, boolean hasTv) {
        super(pricePerNight, capacity, roomNr);
        this.hasTv = hasTv;
    }

    @Override
    public void displayRoomDetails() {
        System.out.println("Room:" + getRoomNr() + "\n Capacity: " + getCapacity() +  "\n PricePerNight: " + getPricePerNight() + "\n TV: " + (hasTv ? "Yes" : "No"));
    }

}