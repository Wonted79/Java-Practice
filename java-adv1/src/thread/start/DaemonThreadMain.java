package thread.start;

public class DaemonThreadMain {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName()+": main() start");
        DaemonThread daemonThread = new DaemonThread();
        daemonThread.setDaemon(true); //기본적으로 사용자 스레드
        daemonThread.start();
        System.out.println(Thread.currentThread().getName()+": main() end");
    }

    static class DaemonThread extends Thread {
        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName()+": run() ");
            try {
                Thread.sleep(10000);
            }catch (InterruptedException e){
                throw new RuntimeException();
            }
            System.out.println(Thread.currentThread().getName()+": run() end");
        }
    }
}
