package homework5;

public class ThreadEx extends Thread {
    private static final Object Room = new Object();
    private static int queue = 1;
    private int numberOfThread;

    public ThreadEx(int numberOfThread) {
        this.numberOfThread = numberOfThread;
    }

    @Override
    public void run() {
        Thread current = Thread.currentThread();
        while (!currentThread().isInterrupted()) {
            synchronized (Room) {
                while (numberOfThread != queue) {
                    try {
                        Room.wait();
                    } catch (InterruptedException ignore) {}
                }
                System.out.println(current.getName());
                try {
                    sleep(1000);
                } catch (InterruptedException ignore) {}
                if (numberOfThread == 1) {
                    queue = 2;
                } else {
                    queue = 1;
                }
                Room.notify();
            }
        }
    }
}