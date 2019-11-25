package com.javarush.task.task04.task0420;

/* 
Сортировка трех чисел
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

        if (a<b)
            if (b<c)
                System.out.println(c+" "+b+" "+a);
            else
                if (a<c)
                    System.out.println(b+" "+c+" "+a);
                else
                    System.out.println(b+" "+a+" "+c);
        else //a>b
            if (a<c)
                System.out.println(c+" "+a+" "+b);
            else
                if (c<b)
                    System.out.println(a+" "+b+" "+c);
                else
                    System.out.println(a+" "+c+" "+b);
    }
}
