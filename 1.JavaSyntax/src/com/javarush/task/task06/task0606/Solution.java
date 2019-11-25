package com.javarush.task.task06.task0606;

import java.io.*;

/* 
Чётные и нечётные циферки
*/

public class Solution {

    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {
        //напишите тут ваш код

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int s;

        while(a>0) {
            s=a%10;
            if (s%2==0)
                even++;
            else
                odd++;
            a=a/10;
        }
        System.out.println("Even: "+even+" Odd: "+odd);

    }
}
