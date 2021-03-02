package lesson1.thirdTask;

import lesson1.thirdTask.model.Apple;
import lesson1.thirdTask.model.Box;
import lesson1.thirdTask.model.Fruit;
import lesson1.thirdTask.model.Orange;

public class AppRun {
    public static void main(String[] args) {
        Box<Apple> appleBox1 = new Box<>();
        Box<Apple> appleBox2 = new Box<>();
        Box<Orange> orangeBox = new Box<>();
        appleBox1.add(new Apple());
        appleBox1.add(new Apple());
        orangeBox.add(new Orange());
        orangeBox.add(new Orange());
        System.out.println(appleBox1.compare(orangeBox));
        System.out.println("\nApple box 1:");
        for (Fruit fruit : appleBox1.getFruits()){
            System.out.println(fruit);
        }
        appleBox1.replaceFruits(appleBox2);
        System.out.println("\nApple box 2:");
        for (Fruit fruit : appleBox2.getFruits()){
            System.out.println(fruit);
        }
        System.out.println("\nOrange box:");
        for (Fruit fruit : orangeBox.getFruits()){
            System.out.println(fruit);
        }
    }
}
