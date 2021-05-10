package Lesson7;

import Lesson7.annotations.AfterSuite;
import Lesson7.annotations.BeforeSuite;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Test {
    private static int before = -1;
    private static int after = -1;
    private static int priority = 10;

    private Test(){

    }

    public static void start(String name) throws ClassNotFoundException, IllegalAccessException, InstantiationException, InvocationTargetException {
        start(Class.forName(name));
    }

    public static void start(Class aClass) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        Method[] methods = aClass.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++){
            if (methods[i].getAnnotation(BeforeSuite.class) != null){
                if (before != -1)
                    throw new RuntimeException("no more than one annotation @BeforeSuite");
                before = i;
            }
            if (methods[i].getAnnotation(AfterSuite.class) != null){
                if (after != -1)
                    throw new RuntimeException("no more than one annotation @AfterSuite");
                after = i;
            }
        }
        Object test = aClass.newInstance();
        if (before != -1){
                methods[before].invoke(test);
        }
        while (priority > 0){
            for (Method method : methods){
                if (method.getAnnotation(Lesson7.annotations.Test.class) != null){
                    Lesson7.annotations.Test annotation = method.getAnnotation(Lesson7.annotations.Test.class);
                    if (annotation.priority() == priority){
                        method.invoke(test);
                    }
                }
            }
            priority--;
        }
        if (after != -1){
            methods[after].invoke(test);
        }
    }
}
