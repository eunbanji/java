package chap_11;

public class _05_TryWithResources {
    public static void main(String[] args) {
        MyFileWriter writer1 = null;
        try {
            writer1 = new MyFileWriter();
            writer1.write("아이스크림이 먹고 싶어요.");
        }catch (Exception e){
            e.printStackTrace();
        } finally {
            try {
                writer1.close();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class MyFileWriter implements AutoCloseable {
    @Override
    public void close() throws Exception {
        System.out.println("파일을 정상적으로 닫습니다.");

    }

    public void write(String line) {
        System.out.println("파일의 내용을 입력합니다.");
        System.out.println("입력내용 : " + line);

    }
}
