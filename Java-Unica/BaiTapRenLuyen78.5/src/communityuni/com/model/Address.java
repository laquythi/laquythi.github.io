package communityuni.com.model;

public class Address extends Student {
    private String streetAddress;
    private String city;
    private String state;
    private long zipCode;


    // constructor
//    public Address(String firstName, String lastName, String homeAddress, String shoolAddress,
//                   String streetAddress, String city, String state, long zipCode) {
//        super(firstName, lastName, homeAddress, shoolAddress);
//        this.streetAddress = streetAddress;
//        this.city = city;
//        this.state = state;
//        this.zipCode = zipCode;
//    }
//
    public Address(String streetAddress, String city, String state, long zipCode) {
        this.streetAddress = streetAddress;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }

    public Address() {
        super();
    }

    // getter setter
    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public long getZipCode() {
        return zipCode;
    }

    public void setZipCode(long zipCode) {
        this.zipCode = zipCode;
    }

//    @Override
//    public String toString() {
//        return streetAddress + " " + city + " " + state + " " + zipCode;
//    }


    @Override
    public String toString() {
        return "Address:" +
                "streetAddress='" + streetAddress + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zipCode=" + zipCode +
                '.';
    }
}
