package communityuni.com.test;

import communityuni.com.model.Man;
import communityuni.com.model.Person;
import communityuni.com.model.Woman;

import java.util.ArrayList;

public class TestPerson {
    public static void main(String[] args) {
        ArrayList<Person> dsPerson = new ArrayList<Person>();
        Person thi = new Man();
        thi.setFirstName("la quy");

        Person hellen = new Woman();
        hellen.setFirstName("tran thuy");

        ((Woman)hellen).setWearningMakup(true);

        dsPerson.add(thi);
        dsPerson.add(hellen);

        for (Person p : dsPerson) {
            if(p instanceof Man){
                System.out.println(p.getFirstName() + " la nam");
            }else if(p instanceof Woman){
                System.out.println(p.getFirstName() + " la nu");
            }
        }
    }
}
