package hotel;

import java.time.LocalDate;

public class Room {
    private double pricePerNight;
    private int capacity;
    private String roomNr;
    private boolean isBooked;

    public Room(double pricePerNight, int capacity, String roomNr) {
        this.pricePerNight = pricePerNight;
        this.capacity = capacity;
        this.roomNr = roomNr;
        this.isBooked = false;
    }






    //----------------------------METHODS-------------------------------------------------------------------
    //Detta under kan vara fel
    public boolean isAvailable(LocalDate checkInDate, LocalDate checkOutDate, LocalDate existingCheckInDate, LocalDate existingCheckOutDate) {
        return checkInDate.isBefore(existingCheckInDate) && checkOutDate.isBefore(existingCheckOutDate) || checkInDate.isAfter(existingCheckInDate) && checkOutDate.isAfter(existingCheckOutDate);
    }
    public double calculatePrice(int nights) {
        return pricePerNight * nights;
    }
    public void bookRoom() {
        if (!isBooked) {
            isBooked = true;
            System.out.println("Room: " + roomNr + " has been booked");
        } else {
            System.out.println("Room: " + roomNr + " is already booked");
        }
    }
    public void cancelBooking() {
        if (isBooked) {
            isBooked = false;
            System.out.println("The booking for room: " + roomNr + " has been cancelled");
        } else {
            System.out.println("Room: " + roomNr + " is not booked");
        }
    }
    public void displayRoomDetails() {
        System.out.println("Room: " + getRoomNr() + "\n Capacity: " + getCapacity());
    }

    //-------------------------- G & S -----------------------------------------------------------------
    public double getPricePerNight() {return pricePerNight;}
    public void setPricePerNight(double pricePerNight) {this.pricePerNight = pricePerNight;}
    public int getCapacity() {return capacity;}
    public void setCapacity(int capacity) {this.capacity = capacity;}
    public String getRoomNr() {return roomNr;}
    public void setRoomNr(String roomNr) {this.roomNr = roomNr;}
    public boolean isBooked() {return isBooked;}
    public void setBooked(boolean booked) {isBooked = booked;}
}