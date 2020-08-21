package com.company;

public class Main {

    public static void main(String[] args) {
	// creating objects
        System.out.println("Hej Hej");
        Person vasya = new Person(120, "Vasya");
        vasya.height=120;
        vasya.say("Vitya");
        System.out.println(vasya.name + "'s height is "+ vasya.height);
        Person vlad = new Person(180);
        System.out.println(vlad.height);

        Student freshman = new Student(160,"Freshman", 3);
        freshman.tell();
        //System.out.println("Student's course is "+ freshman.course);

    }
}
