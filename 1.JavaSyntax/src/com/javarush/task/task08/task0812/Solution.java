package com.javarush.task.task08.task0812;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Cамая длинная последовательность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        List<Integer> list = new ArrayList<Integer>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i=0; i<10; i++) {
            list.add(Integer.parseInt(reader.readLine()));
        }
        int max=1;
        int mid=1;
        for (int i=1; i<10; i++) {
            if (list.get(i).equals(list.get(i-1)))
                mid=mid+1;
            else
                if (mid>1) {
                    if (mid>max)
                        max=mid;
                    mid=1;
                }
        }
        if (mid>max)
            max=mid;

        System.out.println(max);

    }
}