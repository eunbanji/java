package chap_07.Camera;

public class SpeedCam extends Camera {

    public SpeedCam() {
       // this.name = "과속 단속 카메라";
        super("과속 단속 카메라ß");
    }

    public void takePicture() {
        // 사진 촬영
        super.takePicture();
        checkSpeed();
        recognizeLicensePlate();
    }

    public void checkSpeed() {
        // 속도 체크
        System.out.println("속도를 측정합니다.");
    }

    public void recognizeLicensePlate() {
        // 번호 인식
        System.out.println("차량 번호를 인식합니다.");

    }
    @Override
    public void showMainFeature() {
        System.out.println(this.name + "의 주요 기능 : 번호 인식" );
    }

}

