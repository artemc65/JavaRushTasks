package com.javarush.task.task09.task0902;

/* 
И снова StackTrace
*/

public class Solution {
    public static void main(String[] args) {
        method1();
    }

    public static String method1() {
        method2();

        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        return stackTraceElements[2].getMethodName();

        //напишите тут ваш код
    }

    public static String method2() {
        method3();

        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        //System.out.println(stackTraceElements[2].getMethodName());
        //напишите тут ваш код
        return stackTraceElements[2].getMethodName();
    }

    public static String method3() {
        method4();

        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        //System.out.println(stackTraceElements[2].getMethodName());
        return stackTraceElements[2].getMethodName();
        //напишите тут ваш код
    }

    public static String method4() {
        method5();

        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        //System.out.println(stackTraceElements[2].getMethodName());
        return stackTraceElements[2].getMethodName();
        //напишите тут ваш код
    }

    public static String method5() {
        //напишите тут ваш код
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        return stackTraceElements[2].getMethodName();
    }
}
