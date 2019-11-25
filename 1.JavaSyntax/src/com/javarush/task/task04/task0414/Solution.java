package com.javarush.task.task04.task0414;

/* 
Количество дней в году
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        boolean vis;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());

        if (a%400==0)
            vis=true;
        else
            if (a%100==0)
                vis=false;
        else
            if (a%4==0)
                vis=true;
        else
            vis=false;

        if (vis)
            System.out.println("количество дней в году: 366");
        else
            System.out.println("количество дней в году: 365");
    }
}