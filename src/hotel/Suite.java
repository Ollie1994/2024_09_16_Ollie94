package hotel;

public class Suite extends Room{ // extends = att subklassen Suite ärver egenskaper och metoder från basklassen Room.
    private boolean hasJacuzzi;

    // konstruktorn
    public Suite(String roomNr, int capacity, boolean hasJacuzzi) {
        super(roomNr, capacity);
        this.hasJacuzzi = hasJacuzzi;
    }

    @Override
    public void displayRoomDetails() {
        System.out.println("Suit with " + getRoomNr() + " nr and capacity of " + getCapacity() + " guests. Jacuzzi: " + (hasJacuzzi ? "Ja" : "Nej"));
    }
}
