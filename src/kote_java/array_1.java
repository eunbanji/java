package kote_java;

import java.util.Scanner;

public class array_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 정수를 N개 입력받습니다.
        System.out.println("정수를 N개 입력하시오");
        int N = scanner.nextInt();

        int[] numbers = new int[N];

        // N개의 정수를 입력받습니다.
        System.out.println("정수를 공백으로 구분하여 입력하시오.");
        for (int i = 0; i < N; i++) {
            numbers[i] = scanner.nextInt();
        }

        // 찾고자 하는 정수 v를 입력
        System.out.println("찾고자 하는 정수 v를 입력하시오");
        int v = scanner.nextInt();

        // numbers 배열에서 찾고자 하는 정수 v를 입력받습니다.
        int count_v = 0;
        for (int i = 0; i < N; i++) {
            if (numbers[i] == v) {
                count_v++;
            }

        }
        System.out.println(count_v);
    }
}
