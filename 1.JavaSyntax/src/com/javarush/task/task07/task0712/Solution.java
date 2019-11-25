package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код

        ArrayList<String> list = new ArrayList<String>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i=0; i<10; i++) {
            list.add(reader.readLine());
        }

        int maxlen=list.get(0).length();
        int maxin=0;
        int minlen=list.get(0).length();
        int minin=0;

        for (int i=1; i<10; i++) {
            if (list.get(i).length()>maxlen){
                maxlen=list.get(i).length();
                maxin=i;
            }
            if (list.get(i).length()<minlen){
                minlen=list.get(i).length();
                minin=i;
            }
        }

        if (maxin<minin)
            System.out.println(list.get(maxin));
        else
            System.out.println(list.get(minin));


    }
}
