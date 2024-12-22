package kote_java;
import java.util.Scanner;
public class for_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt();

        if (T % 4 ==0){
            for (int i=1; i <= (T/4); i++ ) {
                System.out.print("long");
            }
            System.out.println(" int");
        }
        else{
            System.out.println("??");
        }

        scanner.close();

    }
}
