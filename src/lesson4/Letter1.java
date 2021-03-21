package lesson4;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Letter1 {

    private char currentLetter = 'A';
    private Lock lock = new ReentrantLock();
    private volatile int i = 0;

    public void printA() {
        while (i < 5) {
            if (currentLetter == 'A') {
                lock.lock();
                System.out.print(currentLetter);
                currentLetter = 'B';
                lock.unlock();
            }
        }
    }

    public void printB() {
        while (i < 5) {
            if (currentLetter == 'B') {
                lock.lock();
                System.out.print(currentLetter);
                currentLetter = 'C';
                lock.unlock();
            }
        }
    }

    public void printC() {
        while (i < 5) {
            if (currentLetter == 'C') {
                lock.lock();
                System.out.print(currentLetter);
                currentLetter = 'A';
                i++;
                lock.unlock();
            }
        }
    }
}

