package ch03_decorator.beverage;

import ch03_decorator.Beverage;

public class DarkRoast extends Beverage {
    public DarkRoast() {
        super("다크 로스트 커피");
    }

    @Override
    public double cost() {
        return  0.99;
    }
}
