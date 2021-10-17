package jp.example.concurrent.synchronize;

import java.util.concurrent.TimeUnit;

class ExampleBadPolling {

    private static boolean stopRequested;

    public static void main(String[] args) throws InterruptedException {

        final Thread backgroundThread = new Thread(() -> {

            int i = 0;

            // stopRequestedがtrueにされた場合、止まる
            while (!stopRequested) {
                i++;
            }
        });
        backgroundThread.start();

        TimeUnit.SECONDS.sleep(3);
        stopRequested = true;
    }

}
