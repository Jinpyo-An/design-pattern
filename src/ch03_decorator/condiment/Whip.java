package ch03_decorator.condiment;

import ch03_decorator.Beverage;
import ch03_decorator.CondimentDecorator;

public class Whip extends CondimentDecorator {
    Beverage beverage;

    public Whip(final Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", 휘핑";
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.10;
    }
}
