package chap_04;

public class _05_For {
    public static void main(String[] args) {
        // 반복문 For
        // 나코 매장
        System.out.println("어서요세요. 나코입니다.");
        // 또다른 손님이 들어오면?
        System.out.println("어서오세요. 나코입니다.");
        System.out.println("어서오세요. 나코입니다.");
        System.out.println("어서오세요. 나코입니다.");
        System.out.println("어서오세요. 나코입니다.");
        // 매장에서 인사법이 바뀜
        System.out.println("환영합니다 나코입니다.");
        System.out.println("환영합니다 나코입니다.");
        System.out.println("환영합니다 나코입니다.");
        System.out.println("환영합니다 나코입니다.");
        // 매장 이름이 바뀌면
        // 나코 -> 코나
        System.out.println("환영합니다. 코나입니다.");
        System.out.println("섹스요 섹스");

        // 암튼 ㅇㅈㄹ 하기 힘듦
        // 반목문 사용 For
        // for (선언;조건;증감)
        for (int i = 0; i< 10; i++){
            System.out.println("어서오세요. 재빈입니다. " + i);
        }

        // 짝수만 출력 (for i 만 적고 엔터)
        for (int i = 0; i <10; i += 2) {
            System.out.println(i);
        }

        // 홀수만 출력
        for (int i = 1; i <10; i += 2) {
            System.out.println(i);
        }

        // 거꾸로 숫자
        for (int i = 5; i > 0; i--) {
            System.out.print(i);
        }

        System.out.println();

        // 1부터 10까지의 수의 합
        int sum =0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
            System.out.println("현재까지 총 합은 " + sum + "입니다.");
        }
        System.out.println("1부터 10까지의 모든 수의 총합은" + sum + " 입니다.");

    }
}
