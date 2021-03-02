package lesson1.thirdTask.model;

import java.util.ArrayList;
import java.util.List;

public class Box <T extends Fruit>{
    private List<T> fruits;
    private float weight;

    public Box(){
        fruits = new ArrayList<>();
        weight = 0;
    }

    public boolean isEmpty(){
        return fruits.isEmpty();
    }

    public T remove(){
        return fruits.remove(fruits.size() - 1);
    }

    public ArrayList<T> getFruits(){
        return (ArrayList<T>) fruits;
    }

    public float getWeight(){
        return weight;
    }

    public void add(T fruit){
        fruits.add(fruit);
        weight += fruit.getWeight();
    }
    
    public boolean compare(Box box) {
        return this.weight == box.getWeight();
    }
}
