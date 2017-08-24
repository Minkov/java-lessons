package com.demos;

public class Main {

    public static void main(String[] args) {
        Person[] people = {
                new Person("John", 19),
                new Teacher("Jane", 45, "Math"),
                new Superhero("Batman", "Bruce Wayne", 
                        new Power("Utility belt"),
                        new Power("Intelligence")
                )
        };

        for (Person p : people) {
            p.introduce();
        }
    }
}
