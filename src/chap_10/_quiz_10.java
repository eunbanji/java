package chap_10;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class _quiz_10 {
    public static void main(String[] args) {
        // 챈들러 50세
        // 레이첼 42세
        // 모니카 21세
        // 벤자민 18세
        // 제임스 5세




    }
}
class Customer{
    public void customer() {
        String[] name = {"챈들러", "레이첼", "모니카", "벤자민", "제임스"};
        Stream<String> namestream = Arrays.stream(name);
        int [] age = {50, 42, 21, 18, 5};
        IntStream agestream = Arrays.stream(age);




    }
}
