package chap_07;

public class _18_Enum {
    public static void main(String[] args) {
        // 열거형 (Enum)
        // 달력 : JAN, FEB, MAR
        // 옷 사이즈: S, M, L, XL
        // 해상도 :  HD, FHD, QHD, UHD

        Resolution resolution = Resolution.HD;
        System.out.println(resolution);

        resolution = Resolution.FHD;
        System.out.println(resolution);

        System.out.println("동영상 녹화 품질 : ");
        switch (resolution) {

        }

    }
}

enum Resolution {
    HD, FHD, UHD
}
