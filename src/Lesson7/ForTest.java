package Lesson7;

import Lesson7.annotations.AfterSuite;
import Lesson7.annotations.BeforeSuite;
import Lesson7.annotations.Test;

import java.util.Random;

public class ForTest {
    private int a;
    private int b;

    public ForTest(){
        Random random = new Random();
        a = 20;
        b = -10;
        System.out.println("Constructor");
    }

    @BeforeSuite
    public void incB(){
        while (b < 1){
            b++;
        }
        System.out.println("incB (@BeforeSuite)");
    }

    @Test(priority = 10)
    public int sum(){
        System.out.println("sum (@Test p = 10)");
        return a + b;
    }

    @Test
    public int sub(){
        System.out.println("sub (@Test)");
        return a - b;
    }

    @Test(priority = 1)
    public int mul(){
        System.out.println("mul (@Test p = 1)");
        return a * b;
    }

    @Test
    public int div(){
        System.out.println("div (@Test)");
        return a / b;
    }

    @AfterSuite
    public void end(){
        System.out.println("end (@AfterSuite)");
        System.out.println("End");
    }
}
