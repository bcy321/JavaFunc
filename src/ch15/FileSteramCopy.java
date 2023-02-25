package ch15;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileSteramCopy {
    public static void main(String[] args) {
        long millisecond = 0;
        try(FileInputStream fileInputStream = new FileInputStream("a.zip");
            FileOutputStream fileOutputStream = new FileOutputStream("copy.zip")) {
            millisecond = System.currentTimeMillis();
            while(fileInputStream.read() != -1){
                fileOutputStream.write(fileInputStream.read());
            }
            millisecond=System.currentTimeMillis() - millisecond;
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println(millisecond + "   time");
    }
}
