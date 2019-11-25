package com.javarush.task.task07.task0715;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Продолжаем мыть раму
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        ArrayList<String> list = new ArrayList<String>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        list.add("мама");
        list.add("мыла");
        list.add("раму");


        for (int i=1; i<6; i=i+2) {
            list.add(i,"именно");
        }

        for (int i=0; i<6; i++) {
            System.out.println(list.get(i));
        }
    }
}
