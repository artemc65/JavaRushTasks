package com.javarush.task.task05.task0502;

/* 
Реализовать метод fight
*/

public class Cat {
    public int age;
    public int weight;
    public int strength;

    public Cat() {
    }

    public boolean fight(Cat anotherCat) {
        //напишите тут ваш код
        int c1 = 0;
        int c2 = 0;
        if (this.age != anotherCat.age)
            if (this.age > anotherCat.age)
                c1++;
            else
                c2++;
        if (this.weight != anotherCat.weight)
            if (this.weight > anotherCat.weight)
               c1++;
            else
                c2++;

        if (this.strength != anotherCat.strength)
            if (this.strength > anotherCat.strength)
                c1++;
            else
                c2++;

        return (c1>c2);

    }

    public static void main(String[] args) {

    }
}
