package com.javarush.task.task09.task0918;

/* 
Все свои, даже исключения
*/

import java.io.FileNotFoundException;
import java.net.SocketException;

public class Solution {
    public static void main(String[] args) {
    }
    /*
    static class MyException {
    }

    static class MyException2 {
    }

    static class MyException3 {
    }

    static class MyException4 {
    }

/*
    int i = (int) (Math.random() * 4);
        if (i == 0) {
        throw new NullPointerException();
    } else if (i == 1) {
        throw new ArithmeticException();
    } else if (i == 2) {
        throw new FileNotFoundException();
    } else if (i == 3) {
        throw new URISyntaxException("", "");
    }

    public static void method1() throws Exception1, Exception2, Exception3 {
        int i = (int) (Math.random() * 3);
        if (i == 0) {
            throw new Exception1();
        } else if (i == 1) {
            throw new Exception2();
        } else if (i == 2) {
            throw new Exception3();
        }
    }*/
    static class MyException extends SocketException {
    }

    static class MyException2 extends FileNotFoundException {
    }

    static class MyException3 extends RuntimeException {
    }

    static class MyException4 extends IndexOutOfBoundsException {
    }
}

