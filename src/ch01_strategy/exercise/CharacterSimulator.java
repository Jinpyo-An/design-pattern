package ch01_strategy.exercise;

import ch01_strategy.exercise.behavior.BowAndArrowBehavior;

public class CharacterSimulator {

    public static void main(String[] args) {
        Character queen = new Queen();
        queen.performWeapon();

        queen.setWeaponBehavior(new BowAndArrowBehavior());
        queen.performWeapon();
    }
}
