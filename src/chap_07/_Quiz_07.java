package chap_07;

// 클래스를 이용하여 햄버거를 자동으로 만드는 프로그램을 작성하시오
// 햄버거의 종류는 햄버거, 치즈버거, 새우버거
// 버거 이름을 담기 위한 name 변수 정의
// 재료 정보를 표시하는 cook() 메소드 정의
// 공통 부분은 상속 및 메소드 오버라이딩으로 처리
// 모든 클래스는 하나의 파일에 정의


import chap_07.Camera.Camera;

import java.lang.reflect.Array;
import java.util.ArrayList;

class HamBurger {


    public String name;
    public ArrayList<String> ingredients;


    public HamBurger() {
        this("햄버거", new ArrayList<>());
        ingredients.add("양상추");
        ingredients.add("패티");
        ingredients.add("피클");
    }

    public HamBurger(String name, ArrayList<String> ingredients) {
        this.name = name;
        this.ingredients = ingredients;
    }

    public void cook() {
        System.out.println(name + "를 만듭니다.");
        System.out.println("빵 사이에 들어가는 재료는?");
        for (String ingredient : ingredients) {
            System.out.println("> " + ingredient);
        }
        System.out.println("----------------");
    }


}

// 치즈버거 클래스
class CheezeBurger extends HamBurger {
    public CheezeBurger() {
        super("치즈버거", new ArrayList<>());
        ingredients.add("양상추");
        ingredients.add("패티");
        ingredients.add("피클");
        ingredients.add("치즈");
    }
}


class ShrimpBurger extends HamBurger {
    public ShrimpBurger() {
        super("새우버거", new ArrayList<>());
        ingredients.add("양상추");
        ingredients.add("패티");
        ingredients.add("피클");
        ingredients.add("새우");
    }
}

public class _Quiz_07 {
    public static void main(String[] args) {
        HamBurger[] hamBurgers = new HamBurger[3];
        hamBurgers[0] = new HamBurger();
        hamBurgers[1] = new CheezeBurger();
        hamBurgers[2] = new ShrimpBurger();

        System.out.println("주문하신 메뉴를 만듭니다.");
        System.out.println("----------------");
        for (HamBurger hamBurger : hamBurgers) {
           hamBurger.cook();
        }
        System.out.println("메뉴 준비가 완료되었습니다.");


    }
}


