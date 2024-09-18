package hotel;

public class Suite extends Room{ // extends = att subklassen Suite ärver egenskaper och metoder från basklassen Room.
    private boolean hasJacuzzi;

    // konstruktorn
    public Suite(String roomNr, int capacity, double pricePerNight, boolean hasJacuzzi) {
        super(roomNr, capacity, pricePerNight);
        this.hasJacuzzi = hasJacuzzi;
    }

    @Override
    public void displayRoomDetails() {
        System.out.println("Suit " + getRoomNr() + ", with a price per night of " + getPricePerNight() + " Kr and capacity of " + getCapacity() + " guests. Jacuzzi: " + (hasJacuzzi ? "Ja" : "Nej"));
    }
}
