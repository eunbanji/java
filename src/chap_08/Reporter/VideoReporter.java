package chap_08.Reporter;

public class VideoReporter implements Reporterble {
    @Override
    public void report() {
        System.out.println("직전 30초 영상과 함께 신고를 진행하겠습니다.");
    }
}
