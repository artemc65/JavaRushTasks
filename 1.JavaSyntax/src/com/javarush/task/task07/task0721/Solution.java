package com.javarush.task.task07.task0721;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Минимаксы в массивах
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] myArray = new int[20];
        for (int i=0; i<20; i++) {
            myArray[i]=Integer.parseInt(reader.readLine());
        }

        int maximum=myArray[0];
        int minimum=myArray[0];

        for (int i=1; i<20; i++) {
            if (myArray[i]>maximum)
                maximum=myArray[i];
            if (myArray[i]<minimum)
                minimum=myArray[i];
        }



        //напишите тут ваш код

        System.out.print(maximum + " " + minimum);
    }
}
