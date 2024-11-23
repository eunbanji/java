package chap_07.Camera;

public class Factory extends Camera {  // 자식 클래


    public Factory() {
       // this.name = "공장 카메라";
        super("공장카메라");
    }
    public void recordVideo() {
        super.recordVideo();
        detectFire();
    }


    public void detectFire() {
        System.out.println("화재를 감지합니다.");

    }
    @Override   // annotation
    public void showMainFeature() {
        System.out.println(this.name + "의 주요 기능 : 화재감지" );
    }

}

