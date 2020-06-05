package cn.hannahl.action.guava.util.concurrent;

import com.google.common.cache.RemovalListener;
import com.google.common.util.concurrent.ThreadFactoryBuilder;
import sun.plugin2.util.SystemUtil;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.concurrent.*;

public class ThreadFactoryBuilderAction {

    public static void main(String[] args) throws InterruptedException {
        ThreadFactory namedThreadFactory = new ThreadFactoryBuilder().setNameFormat("thread-pool-%d").build();
        ThreadPoolExecutor pool = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS,
                new LinkedBlockingQueue<Runnable>(1), namedThreadFactory, new ThreadPoolExecutor.AbortPolicy());
        pool.submit(() -> {
            System.out.println(Thread.currentThread().getName());
            try {
                Thread.sleep(3000l);
                } catch (InterruptedException e) {
                    e.printStackTrace();
            }
        });
        pool.submit(() -> {
            System.out.println(Thread.currentThread().getName());
            try {
                Thread.sleep(2000l);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        pool.submit(() -> {
            System.out.println(Thread.currentThread().getName());
            try {
                Thread.sleep(1000l);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
    }

}
