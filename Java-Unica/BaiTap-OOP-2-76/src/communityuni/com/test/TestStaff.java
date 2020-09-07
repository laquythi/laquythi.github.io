package communityuni.com.test;

import communityuni.com.model.Employee;
import communityuni.com.model.Executive;
import communityuni.com.model.Staff;

public class TestStaff {
    public static void main(String[] args) {
        Staff st = new Staff();

        Employee thi = new Employee();
        thi.setName("thi la quy");
        thi.setAddress("hai ba trung");
        thi.setPhone("123456");
        thi.setPayRate(0.12);
        thi.setSocialSecurityNumber("SEC 151789987");
        st.addStaffMember(thi);

        Employee hellen = new Employee();
        hellen.setName("hellen tran");
        hellen.setAddress("thanh xuan");
        hellen.setPhone("654321");
        hellen.setPayRate(0.66);
        hellen.setSocialSecurityNumber("SEC 27041993");
        st.addStaffMember(hellen);

        Executive an = new Executive();
        an.setName("an nam");
        an.setAddress("thai binh");
        an.setPhone("113102");
        an.setPayRate(0.08);
        an.setSocialSecurityNumber("SEC 1960");
        an.awardBonus(100);
        st.addStaffMember(an);

        st.payDay();
    }
}
