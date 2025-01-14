package ch01_strategy;

import ch01_strategy.behavior.fly.FlyWithWings;
import ch01_strategy.behavior.quack.Quack;

public class MallardDuck extends Duck{

    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    void display() {
        System.out.println("저는 물오리입니다..");
    }
}
