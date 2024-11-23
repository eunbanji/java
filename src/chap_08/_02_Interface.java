package chap_08;

import chap_08.Camera.FactoryCam;
import chap_08.Detecter.AdvancedFireDetector;
import chap_08.Detecter.Detectable;
import chap_08.Detecter.FireDetector;
import chap_08.Reporter.NormalReporter;
import chap_08.Reporter.VideoReporter;

public class _02_Interface {
    public static void main(String[] args) {
        // 인터페이스
        NormalReporter normalReporter = new NormalReporter();
        normalReporter.report();

        VideoReporter videoReporter = new VideoReporter();
        videoReporter.report();

        System.out.println("-------------------------------------");

        Detectable fireDetector = new FireDetector();
        fireDetector.detect();

        Detectable advancedFireDetector = new AdvancedFireDetector();
        advancedFireDetector.detect();

        System.out.println("-----------------------------------");

        FactoryCam factoryCam = new FactoryCam();
        factoryCam.setDetector(fireDetector);
        factoryCam.setReportor(videoReporter);

        factoryCam.detect();
        factoryCam.report();


    }
}
