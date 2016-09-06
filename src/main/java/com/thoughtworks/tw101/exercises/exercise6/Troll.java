package com.thoughtworks.tw101.exercises.exercise6;

/**
 * Created by josiebealle on 06/09/2016.
 */
public class Troll implements Monster {

    private float hitPoints = 40;
    private String name = "Troll";
    @Override
    public void takeDamage(int amount) {
        hitPoints -= amount/2.0;
        hitPoints = (hitPoints < 0) ? 0 : hitPoints;
    }

    @Override
    public void reportStatus() {
        System.out.printf("Name: %s, Hitpoints: %.1f\n", name, hitPoints);
    }
}
