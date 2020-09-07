package communityuni.com.model;

import communityuni.com.model.StaffMember;

import java.util.ArrayList;

public class Staff {
    private ArrayList<StaffMember>staffList;
    
    // constructor ko co doi so truyen vao
    public Staff() {
        super();
        staffList = new ArrayList<StaffMember>();
    }
    // constructor co doi so truyen vao
    public Staff(ArrayList<StaffMember> staffList) {
        this.staffList = staffList;
    }

    public void addStaffMember(StaffMember sm){
        staffList.add(sm);
    }
    public void payDay(){
        for (StaffMember sm: staffList) {
            System.out.println(sm);
        }
    }
}
