package kote_java;
import java.util.Scanner;

public class for_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("테스트 케이스의 수를 입력하시오");
        int T = scanner.nextInt();

        for (int i = 1; i <= T; i++){
            int a = scanner.nextInt();
            int b = scanner.nextInt();

            int c = a+b;
            System.out.println(c);

        }
        scanner.close();



    }
}
