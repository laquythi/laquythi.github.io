package communityuni.com.test;

import communityuni.com.io.TextFileFactory;

import java.util.ArrayList;

public class TextFile {
    public static void main(String[] args) {
        // luu file
//        ArrayList<String> dsData = new ArrayList<String>();
//        dsData.add("hellen");
//        dsData.add("la trang");
//        dsData.add("nhung la");
//
//        boolean kq = TextFileFactory.luuFile(dsData,"D:/dulieutest80.1.word");
//
//        if(kq){
//            System.out.println("luu file thanh cong.");
//        }else{
//            System.out.println("luu file that bai.");
//        }

        // doc file
        ArrayList<String> dsData = TextFileFactory.docFile("D:/dulieutest80.1.word");
            for(String data : dsData){
                System.out.println(data);
            }
    }
}
