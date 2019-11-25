package com.javarush.task.task08.task0820;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* 
Множество всех животных
*/

public class Solution {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();
        Set<Dog> dogs = createDogs();

        Set<Object> pets = join(cats, dogs);
        printPets(pets);

        removeCats(pets, cats);
        printPets(pets);
    }

    public static Set<Cat> createCats() {
        Set<Cat> result = new HashSet<Cat>();
        Set<Cat> set = new HashSet<Cat>();
        set.add(new Cat());
        set.add(new Cat());
        set.add(new Cat());
        set.add(new Cat());

        //напишите тут ваш код

        return set;
    }

    public static Set<Dog> createDogs() {
        //напишите тут ваш код
        Set<Dog> set = new HashSet<Dog>();
        set.add(new Dog());
        set.add(new Dog());
        set.add(new Dog());
        return set;
    }

    public static Set<Object> join(Set<Cat> cats, Set<Dog> dogs) {
        //напишите тут ваш код
        Set<Object> set = new HashSet<>();
        Iterator<Cat> iterator = cats.iterator();
        while (iterator.hasNext())
        {
            set.add(iterator.next());
        }
        Iterator<Dog> iterator2 = dogs.iterator();
        while (iterator2.hasNext())
        {
            set.add(iterator2.next());
        }

        return set;
    }

    public static void removeCats(Set<Object> pets, Set<Cat> cats) {
        //напишите тут ваш код

        Iterator<Cat> iterator = cats.iterator();
        while (iterator.hasNext())
        {
            pets.remove(iterator.next());
        }

    }

    public static void printPets(Set<Object> pets) {
        //напишите тут ваш код
        Iterator<Object> iterator = pets.iterator();

        while (iterator.hasNext())
        {
            System.out.println(iterator.next());
        }
    }

    public static class Cat {
        public Cat() {
        }
    }

    public static class Dog {
        public Dog() {
        }
    }

    //напишите тут ваш код
}
