package chap_04;

public class _03_ElseIf {
    public static void main(String[] args) {
        // 조건문 ElseIf
        // 한라봉 에이드가 있으면 +1
        // 망고 주스가 있으면 +1
        // 또는 아이스 아메리카노 +1

        boolean hallaade = true; // 한라봉 에이드
        boolean mangoJuice = true; //망고 주스

        if (hallaade) {
            System.out.println("한라봉 에이드 +1");
        } else if (mangoJuice) {
            System.out.println("망고 주스 +1");
        }else {
            System.out.println("아이스 아메리카노 +1");
        }
        System.out.println("커피 주문 완료 #1");

        // else If는 여러번 사용 가능

        hallaade = false;
        mangoJuice = false;
        boolean orangejuice = true;
        if (hallaade) {
            System.out.println("한라봉 에이드 +1");
        } else if (mangoJuice) {
            System.out.println("망고 주스 +1");
        } else if (orangejuice) {
            System.out.println("오렌지 주스 +1");
        } else {
            System.out.println("아이스 아메리카노 +1");
        }
        System.out.println("커피 주문 완료 #2");

        // else는 없어도 가능

        hallaade = false;
        mangoJuice = false;
        orangejuice = false;
        if (hallaade) {
            System.out.println("한라봉 에이드 +1");
        } else if (mangoJuice) {
            System.out.println("망고 주스 +1");
        } else if (orangejuice) {
            System.out.println("오렌지 주스 +1");
        }  {
            System.out.println("아이스 아메리카노 +1");
        }
        System.out.println("커피 주문 완료 #3");
    }
}
