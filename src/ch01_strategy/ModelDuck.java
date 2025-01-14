package ch01_strategy;

import ch01_strategy.behavior.fly.FlyNoWay;
import ch01_strategy.behavior.quack.Quack;

public class ModelDuck extends Duck{
    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    void display() {
        System.out.println("저는 모형 오리입니다.");
    }
}
