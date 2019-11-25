package com.javarush.task.task05.task0532;

import java.io.*;

/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int maximum = Integer.parseInt(reader.readLine());
        for (int i=1; i < a; i++) {
            int b = Integer.parseInt(reader.readLine());
            if (b>maximum)
                maximum=b;
        }

        //напишите тут ваш код

        System.out.println(maximum);
    }
}
