package com.dhugge.model;

@Gourmet(amount = 0.33)
public class Merten extends Witcher implements Drinker{

    public Merten(String name, School school, double health, double damage) {
        super(name, school, health, damage);
    }

    @Override
    public void drink() {
        System.out.println("Wine is Cool");
    }
}
