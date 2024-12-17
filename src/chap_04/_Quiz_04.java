package chap_04;

public class _Quiz_04 {
    public static void main(String[] args) {

        int car = 2;
        // 일반 차량인 경우
        int max = 30000;
        int hour = 10;
        int price = 4000 * hour;
        switch (car){
            case 1: // 경차
                if (price > max) {
                    System.out.println("요금은 15000원 입니다.");
                } else {
                    System.out.println("요금은 " + price / 2 + " 입니다.");
                } break;

            case 2: // 장애인

                if (price > max) {
                    System.out.println("요금은 15000원 입니다.");
                } else {
                    System.out.println("요금은 " + price / 2 + " 입니다.");
                } break;

            default: // 일반차량
                if (price > max) {
                    System.out.println("요금은 30000원 입니다.");
                }
                else {
                    System.out.println("요금은 " + price + " 입니다.");
                } break;
        }



    }
}
