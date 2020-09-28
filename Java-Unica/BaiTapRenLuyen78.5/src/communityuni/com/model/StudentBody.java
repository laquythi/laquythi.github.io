package communityuni.com.model;

import java.util.Scanner;

public class StudentBody {
    public static void main(String[] args) {
//        Student student = new Student("thi","la quy","dong hung thai binh","tu liem ha noi");
//        Student studentAddress = new Address("tuong mai","ha noi","viet nam",921214);
//        System.out.println("thong tin sinh vien la " + student.toString());
//        System.out.println("dia chi sinh vien la " + studentAddress.toString());
        
        Student student = new Student();
        student.setFirstName("thi");
        student.setLastName("la quy");
        student.setHomeAddress("dong hung thai binh");
        student.setShoolAddress("tu liem ha noi");

        Address studentAddress = new Address();
        studentAddress.setStreetAddress("tuong mai");
        studentAddress.setCity("ha noi");
        studentAddress.setState("viet nam");
        studentAddress.setZipCode(789987);

        System.out.println("thong tin sinh vien ban vua nhap la \n" + student.toString());
        System.out.println("dia chi sinh vien ban vua nhap la \n" + studentAddress.toString());
    }
}
