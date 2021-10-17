package jp.example.concurrent.synchronize;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

class ExampleVolatil {

    private static volatile boolean stopRequested;

    public static void main(String[] args) throws InterruptedException {

        final Thread backgroundThread = new Thread(() -> {

            int i = 0;

            // stopRequestedがtrueにされた場合、止まる
            while (!stopRequested) {
                i++;
            }
        });
        backgroundThread.start();

        TimeUnit.SECONDS.sleep(1);
        stopRequested = true;
    }

    private static final AtomicLong nextSerialNumber = new AtomicLong();

    public static long generateSerialNumber() {
        return nextSerialNumber.getAndIncrement();
    }

}
