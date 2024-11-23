import java.io.*;   // 입출력 관련 클래스 (OutputStream, ObjectOutputStream 등)를 사용하기 위해 import
import java.net.*;  // 네트워크 관련 클래스 (Socket 등)를 사용하기 위해 import

public class SimpleClient {
    public static void main(String[] args) {
        // try-with-resources 블록으로 자동 리소스 관리를 수행
        try (
                // 1. 서버에 연결을 요청하는 소켓 생성 (localhost의 5000번 포트)
                Socket client = new Socket("localhost", 5000);

                // 2. 서버로 데이터를 보내기 위한 OutputStream 생성
                OutputStream os = client.getOutputStream();

                // 3. OutputStream을 객체화하여 Java 객체를 보낼 수 있는 ObjectOutputStream 생성
                ObjectOutputStream oos = new ObjectOutputStream(os);
        ) {
            // 4. 서버로 문자열 데이터를 전송
            oos.writeObject("안녕, 단순 서버야!"); // 객체를 스트림에 작성하여 전송
            oos.flush(); // 버퍼에 있는 데이터를 즉시 전송

        } catch (Exception e) {
            e.printStackTrace(); // 예외 발생 시 오류 메시지 출력하여 문제 원인 파악
        }
    }
}
