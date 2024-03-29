package com.kristoffer.demo.models.student;

public class Student {

    private String name;
    private int age;
    private boolean isTired;

    public Student(String name, int age, boolean isTired) {
        this.name = name;
        this.age = age;
        this.isTired = isTired;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isTired() {
        return isTired;
    }

    public void setTired(boolean tired) {
        isTired = tired;
    }
}
