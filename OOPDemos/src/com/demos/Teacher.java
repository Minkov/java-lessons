package com.demos;

public class Teacher extends Person {

    private String specialty;

    public Teacher(String name, int age, String specialty) {
        super(name, age);
        this.setSpecialty(specialty);
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public String getSpecialty() {
        return specialty;
    }

    @Override
    protected String getIntroduceMessage() {
        return super.getIntroduceMessage() +
                String.format("I teach %s", this.getSpecialty());
    }
}
