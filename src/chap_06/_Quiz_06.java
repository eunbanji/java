package chap_06;

public class _Quiz_06 {
    // 개인 정보 중 일부를 비공개로 전환하는 프로그램을 작성하시오
    // 개인정보를 비공개로 전환하는 메소드 작성
    // 하나의 메소드에서 모든 동작 처리
    // 각 정보는 아래 위치부터 비공개 적용
    // 이름: 2번째 글자부터
    // 주민등록번호 : 9번째 글자
    // 전화번호 : 10번째 글자

    public static String getHiddenData(String what, int start) {
       String hiddenData = what.substring(0, start);
       for (int i = 0; i < what.length() - start; i++) {
           hiddenData += "*";

       }
       return hiddenData;
    }

    public static void main(String[] args) {
        String name = "김재빈"; // 이름
        String id = "990713-1056128"; // 주민등록번호
        String phone = "010-9623-0713"; // 전화번호

        System.out.println("이름 : " + getHiddenData(name, 1));
        System.out.println("주민등록 번호 : " + getHiddenData(id, 8));
        System.out.println("전화번호 : " + getHiddenData(phone, 9));


    }
}
