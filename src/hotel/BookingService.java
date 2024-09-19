package hotel;

import java.util.ArrayList;
import java.util.List;

public class BookingService {
//____________________________CUSTOMER_________________________________________________
private List<Customer> customers = new ArrayList<>();  // lista med alla custumers
    public void addCustomer(Customer customer) { // metod för att lägga till en customer i listan
        customers.add(customer); // lagt till en customer i arrayList
        System.out.println("Customer " + customer.getName() + " has been added to the system.");
    }
    public void removeCustomer(Customer customer) { // metod för att tabort till en customer i listan
        customers.remove(customer); // tagit bort en customer från arrayList
        System.out.println("Customer " + customer.getName() + " has been removed from the system.");
    }

//___________________________ROOOOMS ADD TO HOTEL______________________________________________________
    private List<Room> rooms = new ArrayList<>();  // lista med alla rum
    public void addRoom(Room room) { // metod för att lägga till ett rum i listan
        rooms.add(room); // lagt till ett room i arrayList
        System.out.println("Room " + room.getRoomNr() + " has been added to the system.");
    }
    private Room findRoom(String roomNr) { // hitta ett rum baserat på rumsnummer, metoden ska vara privat se det som en hjälpmetod för servicen
        for (Room room : rooms) {
            if(room.getRoomNr().equals(roomNr)){
                return room;
            }
        }
        return null;
    }
    public void displayAvailableRooms() { // metod för att visa alla rum
        for (Room room : rooms) {
            // för varje room av typen Room i vår ArrayList rooms
            // gör följande:
            room.displayRoomDetails();
            System.out.println();
        }
    }

//-----------------------------ADDING A ROOM & Customer TO BOOKED LIST_______________________________
// vi testar att skriva om bookRoom
public void bookRoom(String roomNr, int nights, String name, String phoneNumber) { // metod för att boka ett rum baserat rumsnummer och nätter.
    Room room = findRoom(roomNr);
    if (room != null) {
        room.bookRoom(nights, name, phoneNumber);
    } else if (room != null) {
        room.bookRoom(nights, name, phoneNumber);
    } else {
        System.out.println("Room with " + roomNr + " was not found.");
    }
}



    /*
    public void bookRoom(String roomNr, int nights) { // metod för att boka ett rum baserat rumsnummer och nätter.
        Room room = findRoom(roomNr);
        if (room != null) {
            room.bookRoom(nights);
        } else if (room != null) {
            room.bookRoom(nights);
        } else {
            System.out.println("Room with " + roomNr + " was not found.");
        }
    }
    */

    public void cancelBooking(String roomNr) { // metod för att avboka ett rum baserat på rumsnummer
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


}