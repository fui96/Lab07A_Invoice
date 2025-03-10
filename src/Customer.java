public class Customer {
    //Fields
    private String name;
    private String address;

    //Constructor
    Customer(String name, String address) {
        this.name = name;
        this.address = address;
    }

    //Setters and Getters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    public String FullCustomer(){
        return name + ", " + address;
    }
}
