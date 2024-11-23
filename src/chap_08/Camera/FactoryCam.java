package chap_08.Camera;

import chap_08.Detecter.Detectable;
import chap_08.Reporter.Reporterble;

public class FactoryCam extends Camera implements Detectable, Reporterble {

    public Detectable detector;
    public Reporterble reportor;

    public void setDetector (Detectable detector) {
        this.detector = detector;
    }
    public void setReportor (Reporterble reportor) {

        this.reportor = reportor;
    }

    @Override
    public void showMainFeature() {
        System.out.println("화재 감지");
    }

    @Override
    public void detect() {
        detector.detect();

    }

    @Override
    public void report() {
        reportor.report();
    }
}
