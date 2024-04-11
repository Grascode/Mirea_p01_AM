package homework5;

import java.util.concurrent.TransferQueue;

public class Main {
    public static void main(String[] args) {
        Thread thread1 = new ThreadEx(1);
        Thread thread2 = new ThreadEx(2);
        thread1.start();
        thread2.start();
    }
}