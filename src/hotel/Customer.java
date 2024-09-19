package hotel;

public class Customer {
    private String name;
    private String phoneNumber;
    private boolean guest;

    public Customer(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.guest = false; // (standard värde) vill ha detta bli true när gästen bor på hotellet.
        // använd samma sätt som i Room klass.
    }




}

// hålla på med steg 2