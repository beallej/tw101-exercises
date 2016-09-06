package com.thoughtworks.tw101.exercises.exercise6;

/**
 * Created by josiebealle on 06/09/2016.
 */
public class Orc implements Monster {

    private float hitPoints = 20;
    private String name = "Orc";
    @Override
    public void takeDamage(int amount) {
        hitPoints -= amount;
        hitPoints = (hitPoints < 0) ? 0 : hitPoints;
    }

    @Override
    public void reportStatus() {
        System.out.printf("Name: %s, Hitpoints: %.1f\n", name, hitPoints);
    }
}
