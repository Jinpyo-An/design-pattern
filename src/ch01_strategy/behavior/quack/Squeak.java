package ch01_strategy.behavior.quack;

import ch01_strategy.behavior.QuackBehavior;

public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("삑");
    }
}
