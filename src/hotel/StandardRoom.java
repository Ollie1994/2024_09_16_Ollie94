package hotel;

public class StandardRoom extends Room{ // extends = att subklassen StandardRoom ärver egenskaper och metoder från basklassen Room.
    // underklass
    private boolean hasTv;

    public StandardRoom(String roomNr, int capacity, boolean hasTv) {
        super(roomNr, capacity);
        // super kallar på basklassens (Room) konstruktor först
        this.hasTv = hasTv;
    }

    @Override
    public void displayRoomDetails() {
        System.out.println("Standard room with " + getRoomNr() + " nr and capacity of " + getCapacity() + " guests. Tv: " + (hasTv ? "Ja" : "Nej"));
    }
}
