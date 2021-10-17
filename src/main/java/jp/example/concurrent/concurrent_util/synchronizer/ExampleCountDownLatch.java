package jp.example.concurrent.concurrent_util.synchronizer;

import java.util.concurrent.CountDownLatch;

class ExampleCountDownLatch {

    private static CountDownLatch countDownLatch = new CountDownLatch(3); // 引数の数字は完了通知を待つスレッドの数

    public static void main(String[] args) throws InterruptedException {

        final Thread thread1 = new Thread(() -> {
            System.out.println("1 wait...");
            countDownLatch.countDown();
        });
        final Thread thread2 = new Thread(() -> {
            System.out.println("2 wait...");
            countDownLatch.countDown();
        });
        final Thread thread3 = new Thread(() -> {
            System.out.println("3 wait...");
            countDownLatch.countDown();
        });

        thread1.start();
        thread2.start();
        thread3.start();

        countDownLatch.await(); // 引数で指定した数のスレッド数の完了通知を待つ

        System.out.println("finish");
    }
}
