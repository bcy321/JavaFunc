package ch13;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
* 바이트 단위 입력 스트림 최상위 추상 클래스
* 많은 추상 메서드가 선언되어 있고 이를 하위 스트림이 상속받아 구현함
* */
public class InputStream {
    public static void main(String[] args){
        try(  FileInputStream fileInputStream = new FileInputStream("input.txt")){
            int i = fileInputStream.read();
            while (i != -1){
                System.out.println((char)i);
            }
        }catch (IOException e){
            System.out.println(e);
        }
    }
}
