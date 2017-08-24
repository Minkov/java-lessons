package com.demos;

public class Person {
    private String name;
    private int age;
    private boolean introduceMessage;

    public Person(String name, int age) {
        this.setName(name);
        this.setAge(age);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void introduce() {
        System.out.println(this.getIntroduceMessage());
    }

    protected String getIntroduceMessage() {
        return String.format("Hi! My name is %s and I am %d-years-old.", this.getName(), this.getAge());
    }
}
