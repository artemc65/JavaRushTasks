package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Играем в Jолушку
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList<Integer> three = new ArrayList<Integer>(); //делятся на 3
        ArrayList<Integer> even = new ArrayList<Integer>(); //четные
        ArrayList<Integer> other = new ArrayList<Integer>(); //остальные
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i=0; i<20; i++) {
            list.add(Integer.parseInt(reader.readLine()));
        }

        for (int i=0; i<20; i++) {
            if (list.get(i)%2==0 || list.get(i)%3==0) {
                if (list.get(i)%3==0)
                    three.add(list.get(i));
                if (list.get(i)%2==0)
                    even.add(list.get(i));
            }
            else
                other.add(list.get(i));
        }

        printList(three);
        printList(even);
        printList(other);

    }

    public static void printList(ArrayList<Integer> list) {
        //напишите тут ваш код
        for (int i=0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

    }
}
