package hotel;
public class Customer {
    private String name;
    private String phoneNumber;

    public Customer(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }






    //----------------------------METHODS-------------------------------------------------------------------
    public void displayCustomerDetails() {
        System.out.println("Customer: " + getName() + "\n Phonenumber: " + getPhoneNumber());
    }

    //-------------------------- G & S -----------------------------------------------------------------
    public String getName() {return name;}
    public void setName(String name) {this.name = name;}
    public String getPhoneNumber() {return phoneNumber;}
    public void setPhoneNumber(String phoneNumber) {this.phoneNumber = phoneNumber;}


}