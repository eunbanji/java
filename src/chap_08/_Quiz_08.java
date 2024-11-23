package chap_08;

import chap_08.Camera.SpeedCam;
import chap_08.Detecter.SpeedDetect;
import chap_08.Reporter.SpeedReport;

public class _Quiz_08 {
    public static void main(String[] args) {
        SpeedCam speedCam = new SpeedCam();
        speedCam.setdetector(new SpeedDetect());
        speedCam.setReportor(new SpeedReport());
        speedCam.detect();
        speedCam.report();
    }
}
