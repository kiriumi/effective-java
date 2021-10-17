package jp.example.concurrent.concurrent_util.synchronizer;

import java.util.concurrent.Semaphore;

class ExampleSemaphore {

    private static Semaphore semaphore = new Semaphore(2, true); // 引数は同時実行できるスレッド数の上限

    public static void main(String[] args) throws InterruptedException {

        final Thread thread1 = new Thread(() -> {
            try {
                semaphore.acquire();
                System.out.println("1 wait...");
                //                semaphore.release();
            } catch (final InterruptedException e) {
            }
        });

        final Thread thread2 = new Thread(() -> {
            try {
                semaphore.acquire();
                System.out.println("2 wait...");
                //                semaphore.release();
            } catch (final InterruptedException e) {
            }
        });
        final Thread thread3 = new Thread(() -> {
            try {
                semaphore.acquire(); // thread1, 2 で解放をしていないので、待ち続ける
                System.out.println("3 wait...");
                //                semaphore.release();
            } catch (final InterruptedException e) {
            }
        });

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
