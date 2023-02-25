package ch14;

import java.io.FileOutputStream;
import java.io.IOException;

public class OutputStream {
    public static void main(String[] args) {
        try(FileOutputStream fileOutputStream = new FileOutputStream("output.txt")){
            fileOutputStream.write(65);
            fileOutputStream.write(66);
            fileOutputStream.write(67);
        }catch (IOException e){
            System.out.println(e);
        }
        System.out.println("end");
    }
}
