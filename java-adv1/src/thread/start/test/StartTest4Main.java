package thread.start.test;

import util.MyLogger;

public class StartTest4Main {
    public static void main(String[] args) {
        ThreadA threadA = new ThreadA();
        threadA.setName("Thread-A");
        ThreadB threadB = new ThreadB();
        threadB.setName("Thread-B");
        threadA.start();
        threadB.start();
    }

    static class ThreadA extends Thread{
        @Override
        public void run() {
            while(true){
                MyLogger.log("A");
                try{
                    Thread.sleep(1000);
                }
                catch (InterruptedException e){
                    e.getStackTrace();
                }
            }
        }
    }

    static class ThreadB extends Thread{
        @Override
        public void run() {
            while(true){
                MyLogger.log("B");
                try{
                    Thread.sleep(500);
                }
                catch (InterruptedException e){
                    e.getStackTrace();
                }
            }
        }
    }
    /*
    public static void main(String[] args) {
        Thread threadA = new Thread(new PrintWork("A", 1000), "Thread-A");
        Thread threadB = new Thread(new PrintWork("B", 500), "Thread-B");
        threadA.start(); threadB.start();
    }
    static class PrintWork implements Runnable {
        private String content;
        private int sleepMs;
        public PrintWork(String content, int sleepMs) {
            this.content = content;
            this.sleepMs = sleepMs;
        }
        @Override
        public void run() {
            while (true) { // 무한 루프
                log(content);
                try {
                    Thread.sleep(sleepMs);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

     */
}
