package ch01_strategy.behavior.quack;

import ch01_strategy.behavior.QuackBehavior;

public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("꽥");
    }
}
