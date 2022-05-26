package com.comment;

import org.junit.jupiter.api.Test;

import java.util.concurrent.*;

public class MyTest {

    @Test
    void test() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(10, 20, 10,
                TimeUnit.SECONDS, new ArrayBlockingQueue<>(20));
        Runnable runnable = () -> {};
        threadPoolExecutor.execute(runnable);
    }
}