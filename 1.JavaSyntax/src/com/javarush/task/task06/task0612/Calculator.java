package com.javarush.task.task06.task0612;

/* 
Калькулятор
*/

public class Calculator {
    public static int plus(int a, int b) {
        //напишите тут ваш код
        int s=a+b;
        return s;
    }

    public static int minus(int a, int b) {
        //напишите тут ваш код
        int s=a-b;
        return s;
    }

    public static int multiply(int a, int b) {
        //напишите тут ваш код
        int s=a*b;
        return s;
    }

    public static double division(int a, int b) {
        //напишите тут ваш код
        return (double) a/b;

    }

    public static double percent(int a, int b) {
        //напишите тут ваш код

        return (double) b/100*a;
    }

    public static void main(String[] args) {

    }
}