package chap_09;

import chap_09.Coffee.*;
import chap_09.User.User;
import chap_09.User.VIPuser;

public class _02_GenericClass {
    public static void main(String[] args) {
        // 제네릭 클래스
        CoffeeByNumber C1 = new CoffeeByNumber(33);
        C1.ready();

            CoffeeByNickname c2 = new CoffeeByNickname(" 유재석");
            c2.ready();

            System.out.println("-------------------------------");

            CoffeeByName C3 = new CoffeeByName(34);
        C3.ready();

        CoffeeByName C4 = new CoffeeByName(" 박명수");

        System.out.println("------------------------------");
        int C3Name = (int)C3.name;
        System.out.println("주문 고객 번호 " + C3Name);

        String c4name = (String) C4.name;
        System.out.println("주문 고객 이름 : " + c4name );

        // c4name = (String) C3.name;  빨간줄은 안쳐지지만 동작하지 못함, 정수는 문자열로 변환 못행

        System.out.println("------------------------------");

        Coffee<Integer> C5 = new Coffee<>(35);
        C5.ready();

        Coffee<String> C6 = new Coffee<>("조세호");
        C6.ready();
        System.out.println("----------------------------");
        CoffeeByUser<User> c7 = new CoffeeByUser<>(new User("강호동"));
        c7.ready();

        CoffeeByUser<User> c8 = new CoffeeByUser<>(new VIPuser("서장훈"));
        c8.ready();

        System.out.println("-----------------------------");
        orderCoffe("김영철");
        orderCoffe(36);

        System.out.println("-----------------------");
        orderCoffe("김희철", "라떼 ");
    }
    public static <T> void orderCoffe(T name) {

        System.out.println("커피 준비 완료 : " + name);
    }

    public static <T,V> void orderCoffe(T name, V coffee) {

        System.out.println(coffee + "커피 준비 완료 : " + name);
    }
}
