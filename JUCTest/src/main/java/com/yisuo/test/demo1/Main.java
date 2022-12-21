package com.yisuo.test.demo1;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author huangbentai
 * @date 2022/12/13 12:33
 */
public class Main {

    public static void main(String[] args) throws InterruptedException {
        //  模拟线程数
        int threadSum = 1000;

        ThreadUnsafeExample example = new ThreadUnsafeExample();

        // 该线程池，无核心线程，最大线程数为IntMAX，用完即扔
        ExecutorService executorService = Executors.newCachedThreadPool();
        CountDownLatch countDownLatch = new CountDownLatch(threadSum);

        for (int i = 0; i < threadSum; i++) {
            executorService.submit(() -> {
                example.add();
                countDownLatch.countDown();
            });
        }


        countDownLatch.await();
        executorService.close();
        System.out.println(example.getCount());
    }
}
