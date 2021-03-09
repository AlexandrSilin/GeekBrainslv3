package lesson1.thirdTask.model;

import java.util.ArrayList;
import java.util.List;

public class Box <T extends Fruit>{
    private List<T> fruits;

    public Box(){
        fruits = new ArrayList<>();
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
        float weight = 0;
        for (Fruit fruit : fruits){
            weight += fruit.getWeight();
        }
        return weight;
    }

    public void add(T fruit){
        fruits.add(fruit);
    }
    
    public boolean compare(Box box) {
        return this.getWeight() == box.getWeight();
    }
}
