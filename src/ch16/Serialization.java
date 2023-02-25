package ch16;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/*
* 인스턴스의 상태를 그대로 파일 저장하거나 네트워크롤 전송하고 이를 다시 복원하는 방식
* 자바에서는 보조 스트림을 활용하여 직렬화를 제공함
* ObjectInputStream, ObjectOutputStream
* ClassName implements Serializable
* */
public class Serialization {
    public static void main(String[] args) {
        Person person1 = new Person("test1","test1");
        Person person2 = new Person("test2","test2");
        try(FileOutputStream fileOutputStream = new FileOutputStream("serial.txt");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)) {
            objectOutputStream.writeObject(person1);
            objectOutputStream.writeObject(person2);
        }catch (Exception e){
            e.printStackTrace();
        }

        try(FileInputStream fileInputStream = new FileInputStream("serial.txt");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)) {
            Person p1 = (Person) objectInputStream.readObject();
            Person p2 = (Person) objectInputStream.readObject();
            System.out.println(p1);
            System.out.println(p2);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
