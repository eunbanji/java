package chap_06;

public class _01_Method {
    // 메소드 정의 = 파이썬의 함수
    // 어떤 기능하는 코드들의 묶음
    public static void sayHello() {
        System.out.printf("안녕하세요 메소드입니다.\n");
    }




    public static void main(String[] args) {
        // 메소드 호출 전
        System.out.printf("메소드 호출 전\n");
        sayHello();

        System.out.printf("메소드 호출 후");


    }
}
