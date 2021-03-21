package lesson5;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import static java.lang.Thread.sleep;

public class Tunnel extends Stage {

    private volatile int cars = 0;

    public Tunnel() {
        this.length = 80;
        this.description = "Тоннель " + length + " метров";
    }

    @Override
    public void go(Car c) {
        try {
            try {
                System.out.println(c.getName() + " готовится к этапу(ждет): " + description);
                if (cars >= MainClass.CARS_COUNT / 2){
                    sleep(1000);
                }
                new Thread(() -> {
                    try {
                        cars++;
                        sleep(1000);
                        cars--;
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }).start();
                System.out.println(c.getName() + " начал этап: " + description);
                sleep(length / c.getSpeed() * 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                System.out.println(c.getName() + " закончил этап: " + description);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
