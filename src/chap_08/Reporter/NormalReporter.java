package chap_08.Reporter;

public class NormalReporter implements Reporterble {
    @Override
    public void report() {
        System.out.println("일반 화재 신고를 진행합니다.");
    }
}
