package ch01_strategy.behavior.fly;

import ch01_strategy.behavior.FlyBehavior;

public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("날고 있어요!!");
    }
}
