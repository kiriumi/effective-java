package jp.example.concurrent.concurrent_util.executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Example {

    public static void main(String[] args) {

        final ExecutorService exec = Executors.newSingleThreadExecutor();
        exec.execute(() -> System.out.println("タスク"));
        exec.shutdown();

        // 固定数のスレッドプールを使用する場合：Executors.newFixedThreadPool
        // 独自のスレッドプールを使用する場合：ThreadPoolExecutor

    }

}
