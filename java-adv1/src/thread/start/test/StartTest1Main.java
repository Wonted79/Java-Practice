package thread.start.test;

import util.MyLogger;

import static util.MyLogger.*;

public class StartTest1Main {

    public static void main(String[] args) {
        log("main() start");
        Runnable runnable = new CounterRunnable();
        Thread counterThread = new Thread(runnable);
        counterThread.start();
        log("main() end");
    }

    static class CounterRunnable implements Runnable{

        @Override
        public void run() {
            for(int i=1;i<=5;i++){
                log(" value: "+i);
            }
        }
    }
}
