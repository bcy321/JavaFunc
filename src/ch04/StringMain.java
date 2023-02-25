package ch04;

public class StringMain {
    public static void main(String[] args) {
        StringConcatImp stringConcatImp = new StringConcatImp();
        stringConcatImp.makeString("hello","world");

        StringConcat stringConcat = (s1,s2)->System.out.println(s1.concat(s2));
        stringConcat.makeString("hello","world");
    }
}
