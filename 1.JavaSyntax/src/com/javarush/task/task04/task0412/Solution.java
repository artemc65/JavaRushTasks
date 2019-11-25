package com.javarush.task.task04.task0412;

/* 
Положительное и отрицательное число
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sn = reader.readLine();
        int n = Integer.parseInt(sn);

        if (n > 0)
                n=n*2;
        else
            if (n < 0)
                n=n+1;
        System.out.println(n);

    }

}