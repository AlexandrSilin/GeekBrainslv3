package lesson4;

public class Letter {

    private final Object object = new Object();
    private char currentLetter = 'A';

    public void printA() {
        synchronized (object) {
            for (int i = 0; i < 5; i++) {
                try {
                    while (currentLetter != 'A') {
                        object.wait();
                    }
                    System.out.print(currentLetter);
                    currentLetter = 'B';
                    object.notifyAll();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public void printB() {
        synchronized (object) {
            for (int i = 0; i < 5; i++) {
                try {
                    while (currentLetter != 'B') {
                        object.wait();
                    }
                    System.out.print(currentLetter);
                    currentLetter = 'C';
                    object.notifyAll();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public void printC() {
        synchronized (object) {
            for (int i = 0; i < 5; i++) {
                try {
                    while (currentLetter != 'C') {
                        object.wait();
                    }
                    System.out.print(currentLetter);
                    currentLetter = 'A';
                    object.notifyAll();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
