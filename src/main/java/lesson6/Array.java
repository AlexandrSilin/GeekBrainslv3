package lesson6;

import java.util.Arrays;

public class Array {
    public int[] getBeforeQuadruple(int[] arr){
        boolean ex = true;
        int index = 0;
        if (arr.length == 0)
            throw new IllegalArgumentException("array can't be empty");
        for (int i = 0 ; i < arr.length; i++){
            if (arr[i] == 4){
                ex = false;
                index = i;
            }
        }
        if (ex)
            throw new RuntimeException("Array must contain at least one quadruple");
        return index < (arr.length - 1) ? Arrays.copyOfRange(arr, index + 1, arr.length) : null;
    }

    public boolean checkArrayForElements(int[] arr){
        boolean one = false;
        boolean four = false;
        for (int i : arr){
            if (!one && i == 1){
                one = true;
            }
            if (!four && i == 4){
                four = true;
            }
        }
        return one && four;
    }
}
