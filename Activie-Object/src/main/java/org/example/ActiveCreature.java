package org.example;

import java.util.concurrent.BlockingDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.logging.Logger;

public abstract class ActiveCreature {
    private BlockingQueue<Runnable> requests;
    private String name;
    private Thread thread;
    private int status;

    protected ActiveCreature(String name){
        this.name = name;
        this.status = 0;
        this.requests = new LinkedBlockingDeque<>();
        /**
         * 使用一个线程，来查看队列中是否有任务  如果有就执行
         */
        thread = new Thread(new Runnable() {
            @Override
            public void run() {
                boolean infinite = true;
                while (infinite){
                    try {
                        requests.take().run();
                    } catch (InterruptedException e) {
//                        throw new RuntimeException(e);
                        infinite = false;
                        Thread.currentThread().interrupt();
                    }
                }
            }
        });
        thread.start();
    }

    public void eat() throws InterruptedException {
        requests.put(new Runnable() {
            @Override
            public void run() {

            }
        });
    }

    public void roam() throws InterruptedException {
        requests.put(new Runnable() {
            @Override
            public void run() {

            }
        });
    }

    public String getName() {
        return name;
    }

    public void kill(int status){
        this.status = status;
        thread.interrupt();
    }

    public int getStatus() {
        return status;
    }
}
