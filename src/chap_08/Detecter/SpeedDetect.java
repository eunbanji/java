package chap_08.Detecter;

public class SpeedDetect implements Detectable {

    @Override
    public void detect() {
        System.out.println("교통사고를 감지합니다.");
    }
}
