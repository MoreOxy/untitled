package com.company;

public class People {
    int age;
    String name;


    People() {
        this.age = 24;
        this.name = "Nastya";

    }
    People(String name) {
        this.name = name;
        age = 29;

    }

    People(int age, String name) {
        this.name = name;
        this.age = age;
    }


    public void Object() {
        System.out.println (name);
        System.out.println (age);
    }

    public static void main(String[] args) {
        People first = new People();
        People second = new People("Vlad");
        People third = new People(32, "Zhenya");

        first.Object();
        second.Object();
        third.Object();
    }
}
