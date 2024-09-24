package hotel;

public class Suite extends Room {
    private boolean hasjacuzzi;

    public Suite(double pricePerNight, int capacity, String roomNr, boolean hasjacuzzi) {
        super(pricePerNight, capacity, roomNr);
        this.hasjacuzzi = hasjacuzzi;
    }

    @Override
    public void displayRoomDetails() {
        System.out.println("Room:" + getRoomNr() + "\n Capacity: " + getCapacity() +  "\n PricePerNight: " + getPricePerNight() + "\n Jacuzzi: " + (hasjacuzzi ? "Yes" : "No"));
    }
}