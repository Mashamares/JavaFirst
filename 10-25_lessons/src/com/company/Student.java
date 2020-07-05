package com.company;

//inheritance
public class Student extends Person{
    int course =1;
    void tell(){
        System.out.println("name "+ super.name + " height " + super.height +" course " +course);
    }

    public Student(int h, String name1, int course){
        height=h;
        name=name1;
        this.course=course;
    }
}
