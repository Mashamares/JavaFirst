package com.company;

public class Person {
    public int height =180;
    public String name="Default";
    public void say (String name){
        System.out.println("Hello " + name);
    }

    //constructor
    public Person(){

    }
    //constructor
    public Person(int h){
        height=h;
    }

    public Person(int h, String name1){
    height=h;
    name=name1;
    }
}
