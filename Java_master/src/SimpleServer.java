import java.net.*;  // 네트워크 관련 클래스 (ServerSocket, Socket 등)를 사용하기 위해 import
import java.io.*;   // 입출력 관련 클래스 (InputStream, ObjectInputStream 등)를 사용하기 위해 import

public class SimpleServer {
    public static void main(String[] args) {
        // try-with-resources 블록으로 자동 리소스 관리를 수행
        try (
                // 1. ServerSocket을 생성하여 5000번 포트에서 클라이언트 연결 대기
                ServerSocket server = new ServerSocket(5000);

                // 2. 클라이언트 연결을 수락하고, 클라이언트와 통신할 Socket 생성
                Socket connection = server.accept();

                // 3. 클라이언트로부터 데이터를 읽기 위한 InputStream 생성
                InputStream is = connection.getInputStream();

                // 4. InputStream을 객체화하여 Java 객체를 읽을 수 있는 ObjectInputStream 생성
                ObjectInputStream ois = new ObjectInputStream(is);
        ) {
            // 5. 클라이언트로부터 전송된 데이터를 문자열로 읽어옴
            String str = (String) ois.readObject(); // 클라이언트에서 보낸 객체를 문자열로 캐스팅
            System.out.println("받은 문자열 = " + str); // 콘솔에 수신된 문자열 출력
        } catch (Exception e) {
            // 예외가 발생했을 때의 처리. 현재는 예외 메시지를 출력하거나 추가 처리 없이 비워둠
            e.printStackTrace(); // 예외 발생 시 예외 스택 트레이스를 출력하여 문제 원인 파악에 도움
        }
    }
}
