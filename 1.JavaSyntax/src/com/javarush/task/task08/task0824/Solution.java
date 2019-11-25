package com.javarush.task.task08.task0824;

import java.util.ArrayList;
import java.util.List;

/* 
Собираем семейство
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Human child1=new Human("Ребенок1", true, 10);
        Human child2=new Human("Ребенок2", false, 11);
        Human child3=new Human("Ребенок3", true, 12);
        ArrayList<Human> childs=new ArrayList<>();
        childs.add(child1);
        childs.add(child2);
        childs.add(child3);
        Human father=new Human("Отец", true, 35, childs);
        Human mother=new Human("Мать", false, 34, childs);
        ArrayList<Human> momarray=new ArrayList<>();
        momarray.add(mother);
        ArrayList<Human> poparray=new ArrayList<>();
        poparray.add(father);
        Human gp1=new Human("Дед1", true, 70, momarray);
        Human gp2=new Human("Дед2", true, 71, poparray);
        Human gm1=new Human("Бабка1", false, 69, momarray);
        Human gm2=new Human("Бабка2", false, 68, poparray);

        System.out.println(gp1.toString());
        System.out.println(gp2.toString());
        System.out.println(gm1.toString());
        System.out.println(gm2.toString());
        System.out.println(father.toString());
        System.out.println(mother.toString());
        System.out.println(child1.toString());
        System.out.println(child2.toString());
        System.out.println(child3.toString());

    }

    public static class Human {
        //напишите тут ваш код
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children=new ArrayList<>();

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name, boolean sex, int age, ArrayList<Human> children) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }
}
