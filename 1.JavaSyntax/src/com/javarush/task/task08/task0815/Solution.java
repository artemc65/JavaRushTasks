package com.javarush.task.task08.task0815;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Перепись населения
*/

public class Solution {
    public static Map<String, String> createMap() {
        //напишите тут ваш код
        Map<String, String> map = new HashMap<String, String>();
        map.put("Иван", "Иванович");
        map.put("Пётр", "Петрович");
        map.put("Артём", "Артёмович");
        map.put("Алексей", "Алексеевич");
        map.put("Владимир", "Владимирович");
        map.put("Дмитрий", "Дмитриевич");
        map.put("Виктор", "Викторович");
        map.put("Аркадий", "Аркадьевич");
        map.put("Олег", "Олегович");
        map.put("Игорь", "Игоревич");
        return map;

    }

    public static int getCountTheSameFirstName(Map<String, String> map, String name) {
        //напишите тут ваш код

        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        int res=0;
        while (iterator.hasNext())
        {
            //получение «пары» элементов
            Map.Entry<String, String> pair = iterator.next();
            if (pair.getValue().equals(name))
                res++;
        }

        return res;

    }

    public static int getCountTheSameLastName(Map<String, String> map, String lastName) {
        //напишите тут ваш код


        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        int res=0;
        while (iterator.hasNext())
        {
            //получение «пары» элементов
            Map.Entry<String, String> pair = iterator.next();
            if (pair.getKey().equals(lastName))
                res++;
        }

        return res;



    }

    public static void main(String[] args) {

    }
}
