package com.javarush.task.task07.task0724;

/* 
Семейная перепись
*/

public class Solution {
    public static void main(String[] args) {
        // напишите тут ваш код
        Human pop1=new Human("Игорь", true, 70);
        Human pop2=new Human("Олег", true, 71);
        Human ma1=new Human("Ирина", false, 69);
        Human ma2=new Human("Ольга", false, 68);
        Human dad=new Human("Жора", true, 50, pop1, ma1);
        Human mom=new Human("Юля", false, 49, pop2, ma2);
        Human son=new Human("Утюг", true, 15, dad, mom);
        Human daughter=new Human("Даздраперма", false, 10, dad, mom);
        Human son2=new Human("Упырь", true, 10, dad, mom);

        System.out.println(pop1.toString());
        System.out.println(pop2.toString());
        System.out.println(ma1.toString());
        System.out.println(ma2.toString());
        System.out.println(dad.toString());
        System.out.println(mom.toString());
        System.out.println(son.toString());
        System.out.println(daughter.toString());
        System.out.println(son2.toString());

       // : Два дедушки, две бабушки, отец, мать, трое детей. Вывести объекты на экран.


    }

    public static class Human {
        // напишите тут ваш код
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;

        public Human(String name, boolean sex, int age, Human father, Human mother) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null) {
                text += ", отец: " + this.father.name;
            }

            if (this.mother != null) {
                text += ", мать: " + this.mother.name;
            }

            return text;
        }
    }
}