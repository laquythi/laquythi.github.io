package communityuni.com.model;

public abstract class StaffMember {
    protected String name;
    protected String address;
    protected String phone;

    // constructor
    public StaffMember() {
        super();
    }

    public StaffMember(String name, String address, String phone) {
        super();
        this.name = name;
        this.address = address;
        this.phone = phone;
    }

    // getter setter
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return this.name + "-" + this.address + "-" + this.phone;
    }

    public abstract double pay();
}
