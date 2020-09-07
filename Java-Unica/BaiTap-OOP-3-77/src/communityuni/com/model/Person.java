package communityuni.com.model;

import java.util.Date;

public abstract class Person implements Mammal {
    private String firstName;

    // bloodgroup from BloodGroup
    private BloodGroup blood;

    // Address from Address
    private Address homeAddress;
    private Address schoolAddress;

    // getter setter
    public BloodGroup getBlood() {
        return blood;
    }

    public void setBlood(BloodGroup blood) {
        this.blood = blood;
    }

    public Address getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(Address homeAddress) {
        this.homeAddress = homeAddress;
    }

    public Address getSchoolAddress() {
        return schoolAddress;
    }

    public void setSchoolAddress(Address schoolAddress) {
        this.schoolAddress = schoolAddress;
    }

    // getter setter
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    // method implement from Mammal
    public void setDateOfBirth(String dob){

    }
    public int getAgeAsDay(){
        return 0;
    }

}
