package Lesson7;

import java.lang.reflect.InvocationTargetException;

public class AppRun {
    public static void main(String[] args) {
        /*try {
            Test.start(ForTest.class);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e) {
            e.printStackTrace();
        }*/

        try {
            Test.start("Lesson7.ForTest");
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
