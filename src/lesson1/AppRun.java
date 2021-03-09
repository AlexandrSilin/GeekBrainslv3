package lesson1;

import lesson1.models.Cat;
import lesson1.models.Dog;
import lesson1.service.ArrayService;

import java.util.List;

public class AppRun {
    public static void main(String[] args) {
        ArrayService<Object> arrayService = new ArrayService<>();
        Object[] objects = new Object[2];
        objects[0] = new Cat();
        objects[1] = new Dog();

        System.out.println("Default array:");
        for (Object o : objects){
            System.out.println(o);
        }

        System.out.println("\nEdited array:");
        try {
            objects = arrayService.swap(objects, 0, 1);
        } catch (IllegalAccessException e) {
            System.out.println(e.getMessage());
        }
        for (Object o : objects){
            System.out.println(o);
        }

        System.out.println("\nGet list from array:");
        List<Object> list = arrayService.getArrayList(objects);
        for (Object o : list){
            System.out.println(o);
        }
    }
}
