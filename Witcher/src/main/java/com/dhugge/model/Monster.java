package com.dhugge.model;

public class Monster {
    private double health;
    private double damage;

    public Monster(double health, double damage) {
        this.health = health;
        this.damage = damage;
    }

    public double getHealth() {
        return health;
    }

    public void setHealth(double health) {
        this.health = health;
    }

    public double getDamage() {
        return damage;
    }

    public void setDamage(double damage) {
        this.damage = damage;
    }
}
