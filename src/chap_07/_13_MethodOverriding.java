package chap_07;

import chap_07.Camera.Camera;
import chap_07.Camera.Factory;
import chap_07.Camera.SpeedCam;
import chap_08.Camera.FactoryCam;

public class _13_MethodOverriding {
    public static void main(String[] args) {
        // 메소드 오버라이딩: 자식 클래스에서 부모 클래스의 메소드를 덮어쓰기 (재정의)
        Camera camera = new Camera();
        Factory factory = new Factory();
        SpeedCam speedCam = new SpeedCam();

        camera.showMainFeature();
        factory.showMainFeature();
        speedCam.showMainFeature();

    }
}
