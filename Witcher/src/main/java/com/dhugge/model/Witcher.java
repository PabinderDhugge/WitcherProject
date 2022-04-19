package com.dhugge.model;

public abstract class Witcher {
    private String name;
    private School school;
    private double damage;
    private double health;

    public enum School{
        CAT, WOLF, MANTICORE
    }

    public Witcher(String name, School school, double health, double damage) {
        this.name = name;
        this.school = school;
        this.health = health;
        this.damage = damage;
    }

    public void setDamage(double damage) {
        this.damage = damage;
    }

    public double getDamage() {
        return damage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHealth() {
        return health;
    }

    public void setHealth(double health) {
        this.health = health;
    }

    public School getSchool() {
        return school;
    }

    public void setSchool(School school) {
        this.school = school;
    }
}
