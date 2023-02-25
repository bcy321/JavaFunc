package ch14;

import java.io.FileOutputStream;
import java.io.IOException;

public class OutputStreamByte {
    public static void main(String[] args) {
        try(FileOutputStream fileOutputStream = new FileOutputStream("output2.txt")){

            byte[] bytes = new byte[26];
            byte data = 65;
            for (int i=0;i<bytes.length;i++){
                bytes[i] = data++;
            }
            fileOutputStream.write(bytes);
        }catch (IOException e){
            System.out.println(e);
        }
        System.out.println("end");
    }
}
