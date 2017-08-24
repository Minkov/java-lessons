package com.demos;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Superhero extends Person implements ICanFly {

    private Power[] powers;
    private String secretIdentity;

    public Superhero(String name, String secretIdentity, Power... powers) {
        super(name, -1);
        this.setSecretIdentity(secretIdentity);
        this.setPowers(powers);
    }

    @Override
    public void fly() {
        System.out.printf("%s is flying!%n", this.getName());
    }

    public void setPowers(Power[] powers) {
        this.powers = powers;
    }

    public Power[] getPowers() {
        return powers;
    }

    public void setSecretIdentity(String secretIdentity) {
        this.secretIdentity = secretIdentity;
    }

    public String getSecretIdentity() {
        return secretIdentity;
    }

    @Override
    protected String getIntroduceMessage() {
        List<String> powerNames = Arrays.stream(this.getPowers())
                .map(power -> power.getName())
                .collect(Collectors.toList());

        return "I am " + this.getName() + " and I am known for my " + String.join(", my ", powerNames);
    }
}
