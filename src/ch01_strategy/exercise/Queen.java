package ch01_strategy.exercise;

import ch01_strategy.exercise.behavior.KnifeBehavior;

public class Queen extends Character{
    public Queen() {
        weaponBehavior = new KnifeBehavior();
    }

    @Override
    public void fight() {
        System.out.println("왕비는 싸웁니다.");
    }
}
