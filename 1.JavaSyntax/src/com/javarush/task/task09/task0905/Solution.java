package com.javarush.task.task09.task0905;

/* 
Там, в синих глубинах стек-трейса…
*/

public class Solution {
    public static void main(String[] args) {
        int deep = getStackTraceDepth();
    }

    public static int getStackTraceDepth() {
        //напишите тут ваш код
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        /*for (int i=0; i<stackTraceElements.length; i++) {
            System.out.println(stackTraceElements[i]);
        }*/
        //System.out.println(Thread.currentThread().getStackTrace());
        System.out.println(stackTraceElements.length);
         //return currentThread().length - method10().length + 1;

        return stackTraceElements.length;
    }
}

