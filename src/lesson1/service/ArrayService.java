package lesson1.service;

import java.util.ArrayList;
import java.util.List;

public class ArrayService <T>{
    public T[] swap(T[] array, int a, int b) throws IllegalAccessException {
        if (array.length < 2 || a < 0 || a >= array.length || b < 0 || b >= array.length)
            throw new IllegalAccessException("Bad array/indexes");
        T tmp = array[a];
        array[a] = array[b];
        array[b] = tmp;
        return array;
    }

    public List<T> getArrayList(T[] array){
        List<T> list = new ArrayList<>();
//        Collections.addAll(list, array); IDE говорит так делать, но ты сказал не делать задание с помощью
//        доп. библиотек, поэтому решение ниже))
        for (T element : array){
            list.add(element);
        }
        return list;
    }
}
