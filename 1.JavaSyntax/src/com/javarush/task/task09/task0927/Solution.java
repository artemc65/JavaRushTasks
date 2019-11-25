package com.javarush.task.task09.task0927;

import com.sun.javafx.collections.MappingChange;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* 
Десять котов
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap() {
        //напишите тут ваш код
        Map<String, Cat> catmap = new HashMap<>();
        catmap.put("cat", new Cat("Cat"));
        catmap.put("cat1", new Cat("Cat1"));
        catmap.put("cat2", new Cat("Cat2"));
        catmap.put("cat3", new Cat("Cat3"));
        catmap.put("cat4", new Cat("Cat4"));
        catmap.put("cat5", new Cat("Cat5"));
        catmap.put("cat6", new Cat("Cat6"));
        catmap.put("cat7", new Cat("Cat7"));
        catmap.put("cat8", new Cat("Cat8"));
        catmap.put("cat9", new Cat("Cat9"));
        return catmap;
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map) {
        //напишите тут ваш код
        Set<Cat> catset = new HashSet<>();

        for (Map.Entry<String, Cat> pair : map.entrySet())
        {
            catset.add(pair.getValue());
        }
        return catset;

    }

    public static void printCatSet(Set<Cat> set) {
        for (Cat cat : set) {
            System.out.println(cat);
        }
    }

    public static class Cat {
        private String name;

        public Cat(String name) {
            this.name = name;
        }

        public String toString() {
            return "Cat " + this.name;
        }
    }


}
