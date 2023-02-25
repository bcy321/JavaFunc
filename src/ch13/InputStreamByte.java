package ch13;

import java.io.FileInputStream;
import java.io.IOException;

/*
* 바이트 단위 입력 스트림 최상위 추상 클래스
* 많은 추상 메서드가 선언되어 있고 이를 하위 스트림이 상속받아 구현함
* */
public class InputStreamByte {
    public static void main(String[] args){
        try(  FileInputStream fileInputStream = new FileInputStream("D:\\JavaFunc\\src\\ch13\\input.txt")){
            byte[] bytes = new byte[10];
            int i = fileInputStream.read(bytes);
            while (fileInputStream.read(bytes) != -1){
                for (int ch : bytes){
                    System.out.print((char)ch);
                }
                System.out.println();
            }
        }catch (IOException e){
            System.out.println(e);
        }
    }
}
