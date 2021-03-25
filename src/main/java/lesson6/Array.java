package lesson6;

import java.util.Arrays;

public class Array {

    private String getNumbers(int number){
        int tmp = number;
        StringBuilder num = new StringBuilder();
        while (tmp > 0){
            num.append(tmp % 10);
            tmp /= 10;
        }
        return num.toString();
    }

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
            if (i > 9) {
                String num = getNumbers(i);
                if (!four && num.contains(Character.toString('4'))){
                    four = true;
                }
                if (!one && num.contains(Character.toString('1'))){
                    one = true;
                }
            } else {
                if (!one && i == 1) {
                    one = true;
                }
                if (!four && i == 4) {
                    four = true;
                }
            }
        }
        return one && four;
    }
}
