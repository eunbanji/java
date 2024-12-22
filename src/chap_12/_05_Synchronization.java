package chap_12;

public class _05_Synchronization {
    public static void main(String[] args) {
        Runnable cleaner1 =  new Runnable() {
            @Override
            public void run() {
                System.out.println("--직원1 청소 시작(Runnable)--");
                for (int i = 2; i <= 10; i+=2) {
                    System.out.println("(직원1이) " + i + "번방 청소 중");
                }
                System.out.println("--직원1 청소 끝(Runnable)--");
            }
        };

        Runnable cleaner2 = () ->  {
            System.out.println("--직원2 청소 시작(Runnable)--");
            for (int i = 1; i <= 10; i+=2) {
                System.out.println("(직원2이) " + i + "번방 청소 중");
            }
            System.out.println("--직원2 청소 끝(Runnable)--");
        };

        Thread cleaerThread1 = new Thread(cleaner1);
        Thread cleaerThread2 = new Thread(cleaner2);

        cleaerThread1.start();
        cleaerThread2.start();
    }
}
