package ch01_strategy.exercise;

import ch01_strategy.exercise.behavior.WeaponBehavior;

public abstract class Character {
    WeaponBehavior weaponBehavior;

    public Character() {
    }

    public void performWeapon() {
        weaponBehavior.useWeapon();
    }

    public void setWeaponBehavior(WeaponBehavior weaponBehavior) {
        this.weaponBehavior = weaponBehavior;
    }

    public abstract void fight();
}
