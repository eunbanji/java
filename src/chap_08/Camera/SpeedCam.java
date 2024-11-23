package chap_08.Camera;

import chap_08.Detecter.Detectable;
import chap_08.Reporter.Reporterble;
import jdk.javadoc.doclet.Reporter;

public class SpeedCam extends Camera {

    public Detectable detector;
    public Reporterble reportor;

    public void setdetector(Detectable detector){
        this.detector = detector;
    }
    public void setReportor(Reporterble reportor) {
        this.reportor = reportor;
    }

    @Override
    public void showMainFeature() {
        System.out.println("속도 측정, 번호 인식");
    }

    public void detect(){
        detector.detect();
    }

    public void report(){
        reportor.report();
    }
}
