package ch10;

public class Password {
    private String password;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) throws PasswordException {
        if(password == null){
            throw new PasswordException("비밀번호가 없습니다.");
        }else if(password.length() < 5){
            throw new PasswordException("비밀번호가 5자리 미만 입니다.");
        }else if(password.matches("[a-zA-z]*")){
            throw new PasswordException("비밀번호에 숫자나 특수 문자를 포함하세요");
        }
        this.password = password;
    }
}
