package chap_07;

// 클래스를 이용하여 햄버거를 자동으로 만드는 프로그램을 작성하시오
// 햄버거의 종류는 햄버거, 치즈버거, 새우버거
// 버거 이름을 담기 위한 name 변수 정의
// 재료 정보를 표시하는 cook() 메소드 정의
// 공통 부분은 상속 및 메소드 오버라이딩으로 처리
// 모든 클래스는 하나의 파일에 정의


import chap_07.Camera.Camera;

class HamBurger {

    public HamBurger() {
        this("햄버거");
    }

    public String name;


    public HamBurger(String name) {
            this.name = name;
        }


}
public class _Quiz_07 {
    public static void main(String[] args) {

    }
}
