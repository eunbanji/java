package chap_08.Reporter;

public class SpeedReport implements Reporterble {

    @Override
    public void report() {
        System.out.println("직전 30초 영상과 함께 신고를 진행합니다.");
    }
}
