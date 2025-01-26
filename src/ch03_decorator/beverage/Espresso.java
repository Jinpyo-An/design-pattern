package ch03_decorator.beverage;

import ch03_decorator.Beverage;

public class Espresso extends Beverage {

    public Espresso() {
        super("에스프레소");
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
