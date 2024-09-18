package hotel;

import java.util.ArrayList;
import java.util.List;
public class BookingService {
    // lista med alla rum
    private List<Room> rooms = new ArrayList<>();
    // metod för att lägga till ett rum i listan
    public void addRoom(Room room) {
        rooms.add(room);
        // lagt till ett room i arrayList
        System.out.println("Room " + room.getRoomNr() + " has been added to the system.");
    }

    // metod för att boka ett rum baserat rumsnummer
    public void bookRoom(String roomNr, int nights) {
        Room room = findRoom(roomNr);
        if (room != null) {
            room.bookRoom(nights);
        } else if (room != null) {
            room.bookRoom(nights);
        } else {
            System.out.println("Room with " + roomNr + " was not found.");
        }
    }

    // metod för att avboka ett rum baserat på rumsnummer
    public void cancelBooking(String roomNr) {
        Room room = findRoom(roomNr);
        if (room != null) {
            room.cancelBooking();
        } else {
            System.out.println("Room with " + roomNr + " was not found.");
        }
    }

    public void calculatePricePerNight(int pricePerNight, int nights) {
        double totalCost = pricePerNight * nights;
        System.out.println("Total cost: " + totalCost);
    }

    // metod för att visa alla tillgängliga rum
    public void displayAvailableRooms() {
        for (Room room : rooms) {
            // för varje room av typen Room i vår ArraList rooms
            // gör följande:
            room.displayRoomDetails();
            System.out.println();
        }
    }

    // hitta ett rum baserat på rumsnummer, metoden ska vara privat se det som en hjälpmetod för servicen
    private Room findRoom(String roomNr) {
        for (Room room : rooms) {
            if(room.getRoomNr().equals(roomNr)){
                return room;
            }
        }
        return null;
    }
}
























