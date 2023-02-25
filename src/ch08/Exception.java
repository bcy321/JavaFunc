package ch08;
/*
* 프로그램에서의 오류
* 컴파일 오류
* 프로그램 코드 작성 중 발생하는 문법적 오류
*
* 실행 오류
* 실행 중인 프로그램이 의도 하지 않은 동작을 하거나 프로그램이 중지 되는 오류
*
* 프로그램의 비정상 종료를 피하여 시스템이 원할이 실행 되도록 함
* 실행 오류가 발생한 경우 오류의 과정을 재현하는 것은 현실적으로 힘들다.
* 오류가 발생한 경우 log 를 남겨서 추후 log 분석을 통해 그 원인을 파악하여 bug를 수정하는 것이 중요
*
* 오류와 클래스
* 시스템 오류 : 가상 머신에서 발생, 프로그래머가 처리 할 수 없는 오류임
*             동적 메모리가 없는 경우, 스택 메모리 오버플로우 등
* 예외 : 프로그램에서 제어 할 수 있는 오류
*       잃어들이려는 파일이 존재하지 않거나 네트워크 DB연결이 안되는 경우
* 자바는 안정성이 중요한 언어로 대부분 프로그램에서 발생하는 오류에 대해 문법적으로 예외처리를 해야함함
*
* try{
*   예외가 발생할 수 있는 부분
* }catch(Exception e){
*   예외 처리 하는 부분
* }
*
*
* */
public class Exception {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        try {
            for (int i=0; i<=5; i++){
                System.out.println(arr[i]);
            }
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("/////////////////////////");
            System.out.println(e.getMessage());
            System.out.println(e.toString());
        }

    }
}
