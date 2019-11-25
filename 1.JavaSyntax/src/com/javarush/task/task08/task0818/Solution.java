package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Только для богачей
*/

public class Solution {
    public static Map<String, Integer> createMap() {
        //напишите тут ваш код
        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("one", 100);
        map.put("two", 200);
        map.put("three", 300);
        map.put("four", 400);
        map.put("five", 500);
        map.put("six", 600);
        map.put("seven", 700);
        map.put("eight", 800);
        map.put("nine", 900);
        map.put("ten", 1000);

        return map;
    }

    public static void removeItemFromMap(Map<String, Integer> map) {
        //напишите тут ваш код

        Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();

        while (iterator.hasNext())
        {
            //получение «пары» элементов
            Map.Entry<String, Integer> pair = iterator.next();
            if (pair.getValue()<500)
                iterator.remove();
                //значение
        }


    }

    public static void main(String[] args) {

    }
}