package chap_02;

public class _Quiz_02 {
    public static void main(String[] args) {
        // 탑승 불가

        int x = 115;
        String i = ((x >= 120) ? ("키가" + x + "cm 이므로 탑승 가능합니다") : ("키가" + x + "cm 이므로 탑승 불가능합니다"));
        System.out.println(i);
           // 탑승 불가

        int y = 121;
        String k = ((y >= 120) ? ("키가" + y + "cm 이므로 탑승 가능합니다") : ("키가" + y + "cm 이므로 탑승 불가능합니다"));
        System.out.println(k);
    }
}
