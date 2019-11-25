package com.javarush.task.task09.task0903;

/* 
Кто меня вызывал?
*/

public class Solution {
    public static void main(String[] args) {
        method1();
    }

    public static int method1() {
        method2();


        //return  Thread.currentThread().getStackTrace().getLineNumber();

        //StackTraceElement[] elements = Thread.currentThread().getStackTrace();
        return  Thread.currentThread().getStackTrace()[2].getLineNumber();


        //return  /*напишите тут ваш код*/ Thread.currentThread(element.getLineNumber());
    }

    public static int method2() {
        method3();
        //return  /*напишите тут ваш код*/ 0;
        return  Thread.currentThread().getStackTrace()[2].getLineNumber();
    }

    public static int method3() {
        method4();
        //return  /*напишите тут ваш код*/ 0;

        return  Thread.currentThread().getStackTrace()[2].getLineNumber();

    }

    public static int method4() {
        method5();
        //return  /*напишите тут ваш код*/ 0;

        return  Thread.currentThread().getStackTrace()[2].getLineNumber();

    }

    public static int method5() {
        return Thread.currentThread().getStackTrace()[2].getLineNumber(); /*напишите тут ваш код*/
    }
}
