package hotel;

public class DeluxeRoom extends Room {

    private boolean hasBalcony;

    public DeluxeRoom(double pricePerNight, int capacity, String roomNr, boolean hasBalcony) {
        super(pricePerNight, capacity, roomNr);
        this.hasBalcony = hasBalcony;
    }

    @Override
    public void displayRoomDetails() {
        System.out.println("Room:" + getRoomNr() + "\n Capacity: " + getCapacity() +  "\n PricePerNight: " + getPricePerNight() + "\n Balcony: " + (hasBalcony ? "Yes" : "No"));
    }

}
