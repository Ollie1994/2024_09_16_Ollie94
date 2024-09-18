package hotel;

public class Main {
    public static void main(String[] args) {
        // skapa ett objekt av Bookingservice så vi kan komma åt alla metoder
        BookingService bookingService = new BookingService();

        StandardRoom room1 = new StandardRoom("101", 2, 1000, true);
        StandardRoom room2 = new StandardRoom("102", 2, 1000, true);
        StandardRoom room3 = new StandardRoom("103", 2, 1000, true);
        StandardRoom room4 = new StandardRoom("104", 2, 1000, true);
        StandardRoom room5 = new StandardRoom("105", 2, 1000, true);
        StandardRoom room6 = new StandardRoom("106", 2, 1000, true);
        StandardRoom room7 = new StandardRoom("107", 2, 1000, true);
        StandardRoom room8 = new StandardRoom("108", 2, 1000, true);
        StandardRoom room9 = new StandardRoom("109", 2, 1000, true);
        StandardRoom room10 = new StandardRoom("110", 2, 1000, true);

        Suite suite1 = new Suite("201", 4, 5000, true);
        Suite suite2 = new Suite("202", 4, 5000, true);
        Suite suite3 = new Suite("203", 4, 5000, true);
        Suite suite4 = new Suite("204", 4, 5000, true);
        Suite suite5 = new Suite("205", 4, 5000, true);



        bookingService.addRoom(room1);
        bookingService.addRoom(suite1);

        System.out.println("---------------------");

        System.out.println("Tillgängliga rum: ");
        bookingService.displayAvailableRooms();
        System.out.println("---------------------");

        System.out.println("Bokar rum 101:");
        bookingService.bookRoom("101", 2);
        System.out.println("---------------------");

        System.out.println("Försöker boka rum 101 igen:");
        bookingService.bookRoom("101", 4);
        System.out.println("---------------------");

        System.out.println("Avbokar rum 101");
        bookingService.cancelBooking("101");
        System.out.println("---------------------");
        System.out.println("Bokar rum 201:");
        bookingService.bookRoom("201", 4);
        System.out.println("---------------------");

        System.out.println("Tillgängliga rum efter alla tester");
        bookingService.displayAvailableRooms();

    }
}













