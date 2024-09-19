package hotel;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // skapa ett objekt av Bookingservice så vi kan komma åt alla metoder
        Scanner sc = new Scanner(System.in);
        BookingService bookingService = new BookingService();
//--------------------------RAW DATA---------------------------------------------------------
        Customer customer1   = new Customer("Robert Nilsson", "0704562345");
        StandardRoom room1 = new StandardRoom("101", 2, 1000, true);
        StandardRoom room2 = new StandardRoom("102", 2, 1000, true);
        StandardRoom room3 = new StandardRoom("103", 2, 1000, true);
        Suite suite1 = new Suite("201", 4, 5000, true);

//-------------------------ADDING TO HOTEL AND REMOVING-----------------------------------
        bookingService.addRoom(room1);
        bookingService.addRoom(room2);
        bookingService.addRoom(room3);
        bookingService.addRoom(suite1);
        bookingService.addCustomer(customer1);

//------------------------------------Input--------------------------------------
        while(true) {
            System.out.println("Menu");
            System.out.println("1. Book a room");
            System.out.println("2. unbook a room");
            System.out.println("3. Add/Remove customer");
            System.out.println("4. Exit");
            int menuChoice = sc.nextInt();
            switch(menuChoice) {
                case 1:
                    System.out.println("Would you like to book room?");
                    String choice = sc.next();
                    if (choice.equals("yes")) {
                        System.out.println("please select room number");
                        String roomNr = sc.next();
                        sc.nextLine(); /// HÄR BARA FÖR ATT INTE SKIPPA INPUT ::::::::::
                        System.out.println("please select name of booker");
                        String name = sc.nextLine();
                        System.out.println("please enter phoneNumber of booker");
                        String phoneNumber = sc.next();
                        System.out.println("please enter nights you will be staying");
                        int nights = sc.nextInt();

                        bookingService.bookRoom(roomNr, nights, name, phoneNumber);
                    } // dem här inmatnignarna vill jag ha in i en arraylist för bokade rum som ajg sedan kan skriva ut
                    // SKULLE behöva separera addRoom från BookingService och lägga till dem i någon för av "ADMIN"
                    else if (choice.equals("no")) {

                    }
                    else {
                        System.out.println("Invalid choice");
                    }

                case 4:
                    return;

            }
        }






    }
}













