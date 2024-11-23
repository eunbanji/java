package chap_07;

import chap_07.Camera.Camera;
import chap_07.Camera.Factory;
import chap_07.Camera.SpeedCam;

public class _12_Inheritance {
    public static void main(String[] args) {
        // 상속
        Camera camera = new Camera();
        Factory factory = new Factory();
        SpeedCam speedCam = new SpeedCam();

        System.out.println(camera.name);
        System.out.println(factory.name);
        System.out.println(speedCam.name);

        camera.takePicture();
        factory.recordVideo();
        speedCam.takePicture();

        factory.detectFire();
        speedCam.checkSpeed();
        speedCam.recognizeLicensePlate();
    }
}
