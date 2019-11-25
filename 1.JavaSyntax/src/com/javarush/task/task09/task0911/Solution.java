package com.javarush.task.task09.task0911;

import java.util.HashMap;

/* 
Исключение при работе с коллекциями Map
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        //try {
        try {
            HashMap<String, String> map = new HashMap<String, String>(null);
            map.put(null, null);
            map.remove(null);
        } catch (NullPointerException e) {
            //e.printStackTrace();
            //String s = e.getMessage();
            //System.out.println("NullPointerException "+s);
            System.out.println(e);
        }
        //}



        /*catch (NullPointerException e) {
            //System.out.println(e);
            String s = e.getMessage();
            System.out.println("NullPointerException "+s);
        }*/



        //напишите тут ваш код
    }
}
