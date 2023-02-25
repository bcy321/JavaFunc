package ch23;

import java.util.ArrayList;

class GosanLibrary{
    public ArrayList<String> shelf = new ArrayList<>();

    public GosanLibrary() {
        shelf.add("태백산맥 1");
        shelf.add("태백산맥 2");
        shelf.add("태백산맥 3");
    }

    public synchronized String lendBook() throws InterruptedException {
        Thread t = Thread.currentThread();

        while(shelf.size() == 0){
            System.out.println(t.getName() + " waiting start");
            wait();
            System.out.println(t.getName() + " waiting end");
        }

        if (shelf.size() > 0) {
            String book = shelf.remove(0);
            System.out.println(t.getName() + " //lend// : " + book);
            return book;
        }
        return null;
    }

    public synchronized void returnBook(String book){
        Thread t = Thread.currentThread();
        shelf.add(book);
        notifyAll();
        System.out.println(t.getName() + " // return //: " + book);
    }
}

class Student extends Thread{

    public Student(String name) {
        super(name);
    }

    @Override
    public void run() {
        try {
            String title = LibraryMain.library.lendBook();
            if (title == null) return;
            sleep(5000);
            LibraryMain.library.returnBook(title);
        }catch (InterruptedException e){
            e.printStackTrace();
        }

    }
}


public class LibraryMain {
    public static GosanLibrary library = new GosanLibrary();

    public static void main(String[] args) {
        Student student1 = new Student("std1");
        Student student2 = new Student("std2");
        Student student3 = new Student("std3");
        Student student4 = new Student("std4");
        Student student5 = new Student("std5");

        student1.start();
        student2.start();
        student3.start();
        student4.start();
        student5.start();
    }
}
