package chap_07;

public class _01_Class {
    public static void main(String[] args) {
        // 객체 지향 프로그래밍 (OOP : Object-Oriented Programming)
        // 유지보수 용이
        // 높은 재사용성

        // 차량용 블랙박스
        // 모델명, 해상도. 가격, 색상


        // 우리가 만든 첫번째 제품
        String modelName = "까망이";
        String resolution = "FHD";
        int price = 200000;
        String color = "블랙";

        // 새로운 제품을 개발
        String modelName2 = "하양이";
        String resolution2 = "UHD";
        int price2 = 300000;
        String color2 = "화이트";

        // 또다른 제품을 개발?
        // 클래스: 서로 다른 자료형이지만 서로 비슷한 것끼리 모아둔 어느 하나의 형태

        BlackBox bbox = new BlackBox();
        // BlackBox 클래스로부터 bbox라는 객체 생성
        // bbox 객체는 BlackBox 클래스의 인스턴스

        BlackBox bbox2 = new BlackBox();


    }
}
