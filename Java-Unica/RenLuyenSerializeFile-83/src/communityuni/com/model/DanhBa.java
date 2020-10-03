package communityuni.com.model;

import java.io.Serializable;

public class DanhBa implements Serializable {
    private String ten;
    private String phone;

    // constructor

    public DanhBa(String ten, String phone) {
        super();
        this.ten = ten;
        this.phone = phone;
    }

    public DanhBa() {
        super();
    }

    // getter setter

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return this.ten + " " + this.phone;
    }
}
