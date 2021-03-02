package lesson1.thirdTask.service;

import lesson1.thirdTask.model.Box;
import lesson1.thirdTask.model.Fruit;

public class BoxService <T extends Fruit> {
    public void replaceFruits(Box<T> box1, Box<T> box2){
        while (!box1.isEmpty()) {
            box2.add(box1.remove());
        }
    }
}
