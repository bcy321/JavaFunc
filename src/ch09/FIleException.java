package ch09;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FIleException {
    public static void main(String[] args) {
//        FileInputStream fileInputStream = null;
//        try {
//            fileInputStream = new FileInputStream("a.txt");
//        } catch (IOException e) {
//            e.printStackTrace();
//            System.out.println(e);
//        }finally {
//            try {
//                fileInputStream.close();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
        //try-with-resource
        try(FileInputStream fileInputStream = new FileInputStream("a.txt")) {
            System.out.println("read");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("end");
    }
}
