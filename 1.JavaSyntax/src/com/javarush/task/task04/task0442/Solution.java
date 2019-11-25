package com.javarush.task.task04.task0442;

/* 
Суммирование
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int s = 0;
        while (true) {
            int x = Integer.parseInt(reader.readLine());
            s=s+x;
            if (x==-1)
                break;
        }
        System.out.println(s);
    }
}
