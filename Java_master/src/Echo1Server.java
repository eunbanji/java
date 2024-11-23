import java.io.*;   // 입출력 관련 클래스 (BufferedReader 등)를 사용하기 위해 import
import java.net.*;  // 네트워크 관련 클래스 (ServerSocket, Socket 등)를 사용하기 위해 import

public class Echo1Server {
    public static void main(String[] args) {
        ServerSocket server = null;        // 클라이언트 연결 요청을 받기 위한 ServerSocket
        Socket connection = null;          // 클라이언트와 연결된 Socket
        BufferedReader in = null;          // 클라이언트로부터 입력을 읽기 위한 BufferedReader

        try {
            // 1. 5001번 포트에서 ServerSocket 생성하여 클라이언트 연결 요청 대기
            server = new ServerSocket(5001);
        } catch (IOException e) {
            e.printStackTrace(); // 예외 발생 시 오류 메시지 출력
        }

        System.out.println("연결 대기 중.....");

        try {
            // 2. 클라이언트 연결을 수락하여 connection 소켓 생성
            connection = server.accept();
        } catch (IOException e) {
            e.printStackTrace(); // 예외 발생 시 오류 메시지 출력
        }

        System.out.println("메시지를 기다리는 중.....");

        try {
            // 3. 클라이언트로부터 데이터를 읽기 위한 BufferedReader 생성
            in = new BufferedReader(
                    new InputStreamReader(connection.getInputStream()));

            String msg;

            // 4. 클라이언트가 보낸 메시지를 한 줄씩 읽어와 출력
            while ((msg = in.readLine()) != null) {
                if (msg.contains("끝")) // "끝"이라는 문자열이 포함되면 종료
                    break;
                System.out.println("읽은 메시지 메아리 : " + msg);
            }

            System.out.println("서버 종료");

        } catch (IOException e) {
            e.printStackTrace(); // 예외 발생 시 오류 메시지 출력
        } finally {
            // 5. 리소스 정리
            try {
                if (in != null) in.close();
                if (connection != null) connection.close();
                if (server != null) server.close();
            } catch (IOException e) {
                e.printStackTrace(); // 예외 발생 시 오류 메시지 출력
            }
        }
    }
}
