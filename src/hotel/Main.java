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
            System.out.println("1. Add/Remove room");
            System.out.println("2. Add/Remove suite");
            System.out.println("3. Add/Remove customer");
            System.out.println("4. Exit");
            int menuChoice = sc.nextInt();
            switch(menuChoice) {
                case 1:
            }
        }






    }
}













