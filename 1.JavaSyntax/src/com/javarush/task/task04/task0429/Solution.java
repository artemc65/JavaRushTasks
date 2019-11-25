package com.javarush.task.task04.task0429;

/* 
Положительные и отрицательные числа
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());



        int x=0;

        if (a>0)
            x=x+1;
        if (b>0)
            x=x+1;
        if (c>0)
            x=x+1;

        int y=0;

        if (a<0)
            y=y+1;
        if (b<0)
            y=y+1;
        if (c<0)
            y=y+1;
        System.out.println("количество отрицательных чисел: "+y);
        System.out.println("количество положительных чисел: "+x);


    }
}
