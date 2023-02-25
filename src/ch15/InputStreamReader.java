package ch15;

import java.io.FileInputStream;
import java.io.IOException;

public class InputStreamReader {
    public static void main(String[] args) {
        try(FileInputStream fileInputStream = new FileInputStream("reader.txt")) {
            while (fileInputStream.read() != -1){
                System.out.println((char)fileInputStream.read());
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
