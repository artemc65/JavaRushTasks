package com.javarush.task.task03.task0303;

/* 
Обмен валют
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        System.out.println(convertEurToUsd(20, 0.81));
        System.out.println(convertEurToUsd(10, 0.81));
    }

    public static double convertEurToUsd(int eur, double course) {
        //напишите тут ваш код
        double res = eur*course;
        return res;
    }
}
