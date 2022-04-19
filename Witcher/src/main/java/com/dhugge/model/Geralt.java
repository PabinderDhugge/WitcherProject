package com.dhugge.model;

public class Geralt extends Witcher implements Drinker {


    public Geralt(String name, School school, double health, double damage) {
        super(name, school, health, damage);
    }

    @Override
    @FireBreath(firePhrase = "Nice Ale!")
    public void drink() {
        System.out.println("Nice ale!");
    }
}
