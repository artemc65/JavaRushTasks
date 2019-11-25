package com.javarush.task.task05.task0507;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Среднее арифметическое
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        float sum=0;
        int x=0;
        while (true) {
            float a = Float.parseFloat(reader.readLine());
            if (a==-1)
                break;
            sum=sum+a;
            x++;
        }

        System.out.println(sum/x);
    }
}

