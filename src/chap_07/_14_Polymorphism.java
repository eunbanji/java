package chap_07;

import chap_07.Camera.Camera;
import chap_07.Camera.Factory;
import chap_07.Camera.SpeedCam;
import chap_08.Camera.FactoryCam;

public class _14_Polymorphism {
    public static void main(String[] args) {
        // 다형성

        //  class person: 사람
        //  class student extends person: 학생    학생은 사람이다.   모든 사람은 학생이 아니다
        //  class teacher extends person: 선생님   선생은 사람이다.   모든 사람은 선생이 아니다.

        Camera camera = new Camera();
        Camera factory = new Factory();
        Camera speedCam = new SpeedCam();

        camera.showMainFeature();
        factory.showMainFeature();
        speedCam.showMainFeature();

        System.out.println("----------------------------");

        Camera[] cameras = new Camera[3];
        cameras[0] = new Camera();
        cameras[1] = new Factory();
        cameras[2] = new SpeedCam();

        for (Camera cam : cameras) {
            cam.showMainFeature();
        }

        System.out.println("-------------------------");
        // factory.detectFire();
        // speedCam.checkSpeed();
        //speedCam.recognizeLicensePlate();

        if (camera instanceof Camera){
            System.out.println("카메라 입니다");

        }

        if (factory instanceof Factory) {
            ((Factory)factory).detectFire();
        }

        if (speedCam instanceof  SpeedCam){
            ((SpeedCam) speedCam).checkSpeed();
            ((SpeedCam) speedCam).recognizeLicensePlate();

        }

//        Object[] objs = new Object[3];
//        objs[0] = new Camera();
//        objs[1] = new Factory();
//        objs[2] = new SpeedCam();

    }
}
