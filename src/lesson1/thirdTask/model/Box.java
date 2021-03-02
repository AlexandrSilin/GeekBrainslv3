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

    public Box(ArrayList<T> fruits){
        weight = 0;
        this.fruits = fruits;
        for (Fruit fruit : fruits){
            weight += fruit.getWeight();
        }
    }

    public void replaceFruits(Box<T> box){
        for (int i = fruits.size() - 1; i >= 0; i--){
            T fruit = fruits.get(i);
            box.add(fruit);
            weight -= fruit.getWeight();
            fruits.remove(fruit);
        }
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
