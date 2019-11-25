package com.javarush.task.task08.task0821;

import java.util.HashMap;
import java.util.Map;

/* 
Однофамильцы и тёзки
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleList();
        printPeopleList(map);
    }

    public static Map<String, String> createPeopleList() {
        //напишите тут ваш код

        Map<String, String> map = new HashMap<String, String>();
        map.put("one", "odin");
        map.put("two", "odin");
        map.put("three", "odin");
        map.put("four", "odin");
        map.put("five", "pyat");
        map.put("five", "shest");
        map.put("five", "sem");
        map.put("eight", "vosem");
        map.put("nine", "devyat");
        map.put("ten", "desyat");

        return map;
    }

    public static void printPeopleList(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
