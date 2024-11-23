package chap_09;

import java.lang.reflect.Array;

public class _01_Generics {
    public static void main(String[] args) {
        // 제네릭스
        Integer[]iArray = {1,2,3,4,5};
        Double[] dArray = {1.0, 2.0, 3.0, 4.0, 5.0};
        String[] sArray = {"A", "B", "C", "D", "E"};

        printIntArray(iArray);
        printDoubleArray(dArray);
        printStringSrray(sArray);

        System.out.println("-----------------------------------");
        printAnyArray(iArray);
        printAnyArray(dArray);
        printAnyArray(sArray);

        // 제네릭스에서 지원하는 건 객체 기본 자료형과 참조자료형 중에 기본 자료형은 바로 쓸 수 없다.




    }
    // T는 타입
    private static <T> void printAnyArray(T[] Array) {
        for (T t :
                Array){
            System.out.print(t + " ") ;// 1 2 3 4 5
        }
        System.out.println();
    }

    private static void printStringSrray(String[] sArray) {

        for (String s :
                sArray){
            System.out.print(s + " ") ;// 1 2 3 4 5
        }
        System.out.println();
    }

    private static void printDoubleArray(Double[] dArray) {
        for (double d  :
                dArray){
            System.out.print(d + " ") ;// 1 2 3 4 5
        }
        System.out.println();
    }

    private static void printIntArray(Integer[] iArray) {
    for (int i :
        iArray){
        System.out.print(i + " ") ;// 1 2 3 4 5
         }
        System.out.println();
    }

}
