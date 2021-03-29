package lesson4;

public class AppRun {

    public static void main(String[] args) {
        Letter letter = new Letter();
        Thread t1 = new Thread(letter::printA);
        Thread t2 = new Thread(letter::printB);
        Thread t3 = new Thread(letter::printC);
        t1.start();
        t2.start();
        t3.start();
    }



}
