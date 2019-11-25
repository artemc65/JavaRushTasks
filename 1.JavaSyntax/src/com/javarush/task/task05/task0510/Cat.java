package com.javarush.task.task05.task0510;

/* 
Кошкоинициация
*/

public class Cat {
    //напишите тут ваш код
    String name;
    int age;
    int weight;
    String address;
    String color;

    public void initialize(String name)
    {
        this.name=name;
        this.age=10;
        this.weight=6;
        this.color="black";
    }

    public void initialize(String name, int weight, int age)
    {
        this.name=name;
        this.age=age;
        this.weight=weight;
        this.color="black";
    }

    public void initialize(String name, int age)
    {
        this.name=name;
        this.age=age;
        this.weight=6;
        this.color="black";
    }

    public void initialize(int weight, String color)
    {
        this.age=10;
        this.weight=weight;
        this.color=color;
    }

    public void initialize(int weight, String color, String address)
    {
        this.age=10;
        this.weight=weight;
        this.color=color;
        this.address=address;
    }

/*7. У класса должен быть метод initialize, принимающий в качестве параметра имя, но инициализирующий все переменные класса, кроме адреса.
8. У класса должен быть метод initialize, принимающий в качестве параметров имя, вес, возраст и инициализирующий все переменные класса, кроме адреса.
9. У класса должен быть метод initialize, принимающий в качестве параметров имя, возраст и инициализирующий все переменные класса, кроме адреса.
10. У класса должен быть метод initialize, принимающий в качестве параметров вес, цвет и инициализирующий все переменные класса, кроме имени и адреса.
11. У класса должен быть метод initialize, принимающий в качестве параметров вес, цвет, адрес и инициализирующий все переменные класса, кроме имени.*/


    public static void main(String[] args) {

    }
}
