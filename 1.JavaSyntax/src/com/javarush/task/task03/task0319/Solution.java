package com.javarush.task.task03.task0319;

/* 
Предсказание на будущее
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        String snum1 = reader.readLine();
        int num1 = Integer.parseInt(snum1);
        String snum2 = reader.readLine();
        int num2 = Integer.parseInt(snum2);
        System.out.println(name+" получает "+num1+" через "+num2+" лет.");
    }
}
