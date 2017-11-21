package com.company;

public class Human {
    private String name;
    private int age;
    Human(){
    }
    Human(String name, int age){
        this.age = age;
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    public void printHuman(){
        System.out.println(name + " ");
        return;
    }
}
