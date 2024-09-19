package hotel;

public class Customer {
    private String name;
    private String phoneNumber;
    private boolean guest;

    //_______________KONSTRUKTOR___________________________________________
    public Customer(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.guest = false; // (standard värde) vill ha detta bli true när gästen bor på hotellet.
        // använd samma sätt som i Room klass.
    }
    //_____________________________________________________________________






//____________________________________________ GETTERS AND SETTERS ______________________________________________________________
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public boolean isGuest() {
        return guest;
    }
    public void setGuest(boolean guest) {
        this.guest = guest;
    }

}