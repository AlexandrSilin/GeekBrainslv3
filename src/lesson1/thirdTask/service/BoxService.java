package lesson1.thirdTask.service;

import lesson1.thirdTask.model.Box;
import lesson1.thirdTask.model.Fruit;

public class BoxService <T extends Fruit> {
    public void replaceFruits(Box<T> box1, Box<T> box2) throws IllegalAccessException {
        if (box1.isEmpty())
            throw new IllegalAccessException("Box 1 is empty()");
        if (box2.isEmpty() ||
                (box1.getFruits().get(0)).getClass().getName().equals((box2.getFruits().get(0)).getClass().getName())) {
            while (!box1.isEmpty()) {
                box2.add(box1.remove());
            }
        } else throw new IllegalAccessException("Can't put from box 1 to box 2");
    }
}
