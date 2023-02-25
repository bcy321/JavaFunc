package ch10;

public class UserDefineException {
    public static void main(String[] args) {
        Password password = new Password();
        String strPassword1 = null;
//        String strPassword2 = "1234";
//        String strPassword3= "abcdef";
//        String strPassword4= "abcdef!";
        try {
            password.setPassword(strPassword1);
//            password.setPassword(strPassword2);
//            password.setPassword(strPassword3);
//            password.setPassword(strPassword4);
            System.out.println("오류 없음");

        } catch (PasswordException e) {
            System.out.println(e.getMessage());
//            e.printStackTrace();
        }
    }
}
