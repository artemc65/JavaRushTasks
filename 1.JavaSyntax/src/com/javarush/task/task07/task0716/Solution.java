package com.javarush.task.task07.task0716;

import java.util.ArrayList;

/* 
Р или Л
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<String>();
        strings.add("роза");
        strings.add("лоза");
        strings.add("лира");
        strings = fix(strings);

        for (String string : strings) {
            System.out.println(string);
        }
    }

    public static ArrayList<String> fix(ArrayList<String> strings) {
        //напишите тут ваш код
        ArrayList<String> strings2 = new ArrayList<String>();
        for (int i=0; i < strings.size(); i++) {
            if (strings.get(i).indexOf("л") != -1 && strings.get(i).indexOf("р") != -1)
                strings2.add(strings.get(i));
            else
                if (strings.get(i).indexOf("р") == -1 && strings.get(i).indexOf("л") != -1) {
                    strings2.add(strings.get(i));
                    strings2.add(strings.get(i));
                }
                else
                if (strings.get(i).indexOf("р") == -1 && strings.get(i).indexOf("л") == -1)
                    strings2.add(strings.get(i));
        }
        return strings2;
    }
}