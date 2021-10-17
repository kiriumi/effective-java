package jp.example.concurrent.synchronize;

import java.util.concurrent.atomic.AtomicLong;

class ExampleAtmic {

    private static long nextSerialNumberSync;

    public static synchronized long generateSerialNumberSync() {
        return nextSerialNumberSync++;
    }

    private static final AtomicLong nextSerialNumberAtmic = new AtomicLong();

    public static long generateSerialNumberAtmic() {
        return nextSerialNumberAtmic.getAndIncrement();
    }

}
