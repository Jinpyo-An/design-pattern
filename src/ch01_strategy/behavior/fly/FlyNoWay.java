package ch01_strategy.behavior.fly;

import ch01_strategy.behavior.FlyBehavior;

public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("저는 못 날아요.");
    }
}
