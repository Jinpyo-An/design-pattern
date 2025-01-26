package ch03_decorator.beverage;

import ch03_decorator.Beverage;

public class Decaf extends Beverage {
    public Decaf() {
        super("디카페인");
    }

    @Override
    public double cost() {
        return 1.05;
    }
}
