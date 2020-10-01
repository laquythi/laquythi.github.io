package communityuni.com.model;

import java.util.Scanner;

public class StudentBody {
    public static void main(String[] args) {
        // cach 1 : hashCode ngay trong constructor
//        Student student = new Student("thi","la quy","dong hung thai binh","tu liem ha noi");
//        Student studentAddress = new Address("tuong mai","ha noi","viet nam",921214);
//        System.out.println("thong tin sinh vien la " + student.toString());
//        System.out.println("dia chi sinh vien la " + studentAddress.toString());


        // cach 2 : hashCode bang set method
//        Student student = new Student();
//        student.setFirstName("thi");
//        student.setLastName("la quy");
//        student.setHomeAddress("dong hung thai binh");
//        student.setShoolAddress("tu liem ha noi");
//
//        Address studentAddress = new Address();
//        studentAddress.setStreetAddress("tuong mai");
//        studentAddress.setCity("ha noi");
//        studentAddress.setState("viet nam");
//        studentAddress.setZipCode(789987);
//
//        System.out.println("thong tin sinh vien ban vua nhap la \n" + student.toString());
//        System.out.println("dia chi sinh vien ban vua nhap la \n" + studentAddress.toString());


        // cach 3 : cho nguoi dung nhap vao thong tin,lay thong tin thong qua constructor va toString method
        Student student;
        Scanner sc = new Scanner(System.in);

        // student -> Student
        System.out.println("nhap first name : ");
        String firstName = sc.nextLine();

        System.out.println("nhap last name : ");
        String lastName = sc.nextLine();

        System.out.println("nhap home address : ");
        String homeAddress = sc.nextLine();

        System.out.println("nhap school address : ");
        String schoolAddress = sc.nextLine();

        student = new Student(firstName,lastName,homeAddress,schoolAddress);
        System.out.println("thong tin ve " + student);

        // student -> address
        System.out.println("nhap street address : ");
        String streetAddress = sc.nextLine();

        System.out.println("nhap city : ");
        String city = sc.nextLine();

        System.out.println("nhap state : ");
        String state = sc.nextLine();

        System.out.println("nhap zip code : ");
        int zipCode = sc.nextInt();

        student = new Address(streetAddress,city,state,zipCode);

        System.out.println("thong tin ve address cua student " + student.toString());

    }
}
