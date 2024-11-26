package chap_07;

class HamBurger2 {
    public String name;

    public HamBurger2(){
        this("햄버거");
    }
    public HamBurger2(String name) {
        this.name = name;
    }

    public void cook() {
        System.out.println(this.name + "를 만듭니다.");
        System.out.println("빵 사이에 들어가는 재료는?");
        System.out.println("> 양상추");
        System.out.println("+ 패티");
        System.out.println("+ 피클");
    }
}

class CheezeBurger2 extends HamBurger2{

    public void cook(){
        super.cook();
        System.out.println("+ 치즈");


    }

}

class ShrimpBurger2 extends HamBurger2{

    public void cook(){
        super.cook();
        System.out.println("+ 새우");


    }


}
public class _Quiz_07_2 {
    public static void main(String[] args) {

        HamBurger2[] hamBurger2s = new HamBurger2[3];
        hamBurger2s[0] = new HamBurger2();
        hamBurger2s[1] = new CheezeBurger2();
        hamBurger2s[2] = new ShrimpBurger2();

        System.out.println("주문하신 메뉴를 만듭니다.");
        System.out.println("----------------");
        for (HamBurger2 hamBurger2 : hamBurger2s) {
            hamBurger2.cook();
            System.out.println("------------------");
        }
        System.out.println("메뉴 준비가 완료되었습니다.");
    }
}
