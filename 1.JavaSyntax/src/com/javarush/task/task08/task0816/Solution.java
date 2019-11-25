package com.javarush.task.task08.task0816;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
Добрая Зинаида и летние каникулы
*/

public class Solution {
    public static Map<String, Date> createMap() throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        Map<String, Date> map = new HashMap<String, Date>();
        map.put("Сталлоне", dateFormat.parse("MAY 1 2012"));
        map.put("Сталлоне2", dateFormat.parse("JUNE 2 2011"));
        map.put("Сталлоне3", dateFormat.parse("JUNE 3 2010"));
        map.put("Сталлоне4", dateFormat.parse("JUNE 4 2009"));
        map.put("Сталлоне5", dateFormat.parse("JUNE 5 2008"));
        map.put("Сталлоне6", dateFormat.parse("MAY 6 2007"));
        map.put("Сталлоне7", dateFormat.parse("MAY 7 2006"));
        map.put("Сталлоне8", dateFormat.parse("MAY 8 2005"));
        map.put("Сталлоне9", dateFormat.parse("MAY 9 2004"));
        map.put("Сталлоне10", dateFormat.parse("MAY 10 2003"));

        //напишите тут ваш код'

        return map;
    }

    public static void removeAllSummerPeople(Map<String, Date> map) {
        //напишите тут ваш код

        Iterator<Map.Entry<String, Date>> iterator = map.entrySet().iterator();

        while (iterator.hasNext())
        {
            //получение «пары» элементов
            Map.Entry<String, Date> pair = iterator.next();
            long x=pair.getValue().getMonth();
            if (x>=5 && x<=7)
                iterator.remove();
            //значение
        }

    }

    public static void main(String[] args) throws ParseException {
        /*Map<String, Date> map1 = new HashMap<String, Date>();
        map1=createMap();
        removeAllSummerPeople(map1);
        for (Map.Entry<String, Date> pair : map1.entrySet())
        {
            String key = pair.getKey();                      //ключ
            long value = pair.getValue().getMonth();                  //значение
            System.out.println(key + ":" + value);
        }*/

    }
}
