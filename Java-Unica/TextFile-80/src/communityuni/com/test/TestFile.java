package communityuni.com.test;

import communityuni.com.io.TextFileFactory;

import java.util.ArrayList;

public class TestFile {
    public static void main(String[] args) {
        // luu file
//        ArrayList<String> dsData = new ArrayList<String>();
//        dsData.add("hellen");
//        dsData.add("trang lax");
//        dsData.add("tracy tran");
//
//        boolean kq = TextFileFactory.luuFile(dsData,"D:/dulieutest.txt");
//
//        if(kq == true){
//            System.out.println("luu file thanh cong");
//        }else{
//            System.out.println("luu file that bai");
//        }

        // doc file
        ArrayList<String> dsData = TextFileFactory.docFile("D:/dulieutest.txt");
        for(String data : dsData){
            System.out.println(data);
        }
    }
}
