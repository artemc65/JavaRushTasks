package com.javarush.task.task08.task0817;

import java.util.*;

/* 
Нам повторы не нужны
*/

public class Solution {
    public static Map<String, String> createMap() {
        //напишите тут ваш код
        Map<String, String> map = new HashMap<String, String>();
        map.put("one", "odin");
        map.put("two", "odin");
        map.put("three", "odin");
        map.put("four", "odin");
        map.put("five", "pyat");
        map.put("six", "shest");
        map.put("seven", "sem");
        map.put("eight", "vosem");
        map.put("nine", "devyat");
        map.put("ten", "desyat");
        return map;

    }

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
        //напишите тут ваш код
        Map<String, String> copy2 = new HashMap<>(map);
        Map<String, String> copy3 = new HashMap<>(map);
        for (Map.Entry<String, String> pair : copy2.entrySet()) {
            String x=pair.getValue();
            int c=0;
            for (Map.Entry<String, String> pair2 : copy3.entrySet()) {
                if (pair2.getValue().equals(x)) {
                    c++;
                    if (c>1){
                        removeItemFromMapByValue(map, x);
                        break;
                    }
                }
            }


            /*Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
            while (iterator.hasNext())
            {
                //получение «пары» элементов
                Map.Entry<String, String> pair = iterator.next();
                if (pair.getValue()<500)
                    iterator.remove();
                //значение
            }*/



        }

    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        Map<String, String> copy = new HashMap<>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value)) {
                map.remove(pair.getKey());
            }
        }

    }

    public static void main(String[] args) {
        /*Map<String, String> map3 = createMap();
        removeTheFirstNameDuplicates(map3);
        for (Map.Entry<String, String> pair : map3.entrySet())
        {
            String key = pair.getKey();                      //ключ
            String value = pair.getValue();                  //значение
            System.out.println(key + ":" + value);
        }*/


    }
}
