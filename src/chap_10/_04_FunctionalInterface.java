package chap_10;

import chap_10.Converter.*;

public class _04_FunctionalInterface {
    public static void main(String[] args) {
        KRWConverter converter = new KRWConverter();
        converter.convert(2);
        // converter.convert(2);
        convertUSD((USD) -> System.out.println(USD + " 달러 = " + (USD * 1400) + " 원"), 1);
        Convertable convertable =(USD) -> System.out.println(USD + " 달러 = " + (USD * 1400) + " 원");
        convertUSD(convertable, 2 );

        // 전달값이 하나도 없다면?
        ConvertableWithParams c1 =() -> System.out.println("1 달러 = 1400원");
        c1.covert();

        // 두 줄 이상의 코드가 있다면?
        c1 = () -> {
            int USD = 5;
            int KRW = 1400;
            System.out.println(USD + "달러 = " + (USD * KRW) + " 원");

        };
        c1.covert();

        // 전달값이 두 개일 때는?
        ConvertableWith2 c2 = (d, w) -> System.out.println(d + "달러 = " + (d * w) + " 원");
        c2.convert(10, 1400);

        // 반환값이 있는 경우
        ConvertableWithReturn c3 = (d, w) -> d * w;
        int result = c3.convert(20, 1400);
        System.out.println("20달러 = "+ result + " 원");


    }

    public static void convertUSD(Convertable converter, int USD) {
        converter.convert(USD);

    }
}
