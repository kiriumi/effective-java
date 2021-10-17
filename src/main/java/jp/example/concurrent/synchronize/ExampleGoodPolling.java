package jp.example.concurrent.synchronize;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

class ExampleGoodPolling {

    private static boolean stopRequested;

    private static synchronized void requestStop() {
        stopRequested = true;
    }

    private static synchronized boolean stopRequested() {
        return stopRequested;
    }

    public static void main(String[] args) throws InterruptedException {

        final Thread backgroundThread = new Thread(() -> {

            int i = 0;

            // stopRequestedがtrueにされた場合、止まる
            while (!stopRequested()) {
                i++;
            }
        });
        backgroundThread.start();

        TimeUnit.SECONDS.sleep(1);
        requestStop();
    }

    private static final AtomicLong nextSerialNumber = new AtomicLong();

    public static long generateSerialNumber() {
        return nextSerialNumber.getAndIncrement();
    }

}
