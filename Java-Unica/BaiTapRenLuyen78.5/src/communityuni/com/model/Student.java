package communityuni.com.model;

public class Student {
    private String firstName;
    private String lastName;
    private String homeAddress;
    private String shoolAddress;

    // constructor
    public Student(String firstName, String lastName, String homeAddress, String shoolAddress) {
        super();
        this.firstName = firstName;
        this.lastName = lastName;
        this.homeAddress = homeAddress;
        this.shoolAddress = shoolAddress;
    }

    public Student() {
        super();
    }

    // getter setter
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }

    public String getShoolAddress() {
        return shoolAddress;
    }

    public void setShoolAddress(String shoolAddress) {
        this.shoolAddress = shoolAddress;
    }

    @Override
    public String toString() {
        return "Student:" +
                "\nfirstName = " + firstName +
                ",\nlastName = " + lastName  +
                ",\nhomeAddress = " + homeAddress  +
                ",\nshoolAddress = " + shoolAddress;
    }
}
