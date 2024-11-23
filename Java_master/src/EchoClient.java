import java.io.*;
import java.net.*;
import java.util.Scanner;

public class EchoClient {
    public static void main(String[] args) {
        Socket client = null;
        PrintWriter out = null;

        try {
            // 1. 소켓을 생성하고 서버에 연결 요청
            client = new Socket();
            System.out.println("에코 서버와 연결 시도...");
            client.connect(new InetSocketAddress("localhost", 5001), 3000);
            System.out.println("에코 서버와 연결 성공.....");

            // 2. 서버로 메시지를 전송할 PrintWriter 생성
            out = new PrintWriter(client.getOutputStream(), true);

            // 3. 사용자 입력을 받을 Scanner 생성
            Scanner in = new Scanner(System.in);
            String msg;

            System.out.println("보낼 메시지가 있나요?");

            // 4. 메시지를 입력받고 서버로 전송
            while ((msg = in.nextLine()) != null) {
                if (msg.contains("끝")) // "끝"이라는 단어가 포함되면 종료
                    break;
                out.println(msg); // 서버로 메시지 전송
                System.out.println("보낼 메시지가 더 있나요?");
            }

            System.out.println("클라이언트 종료");

            // 5. Scanner 리소스 닫기
            in.close();

        } catch (IOException e) {
            e.printStackTrace(); // 예외 발생 시 오류 메시지 출력
        } finally {
            // 6. 리소스 정리
            try {
                if (out != null) out.close();
                if (client != null) client.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
