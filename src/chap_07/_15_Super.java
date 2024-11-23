package chap_07;

import chap_07.Camera.Factory;
import chap_07.Camera.SpeedCam;

public class _15_Super {
    public static void main(String[] args) {
        // Super
        Factory factory = new Factory();
        SpeedCam speedCam = new SpeedCam();

        factory.recordVideo();
        System.out.println("--------------");
        speedCam.takePicture();

    }
}
