package ch03_decorator.condiment;

import ch03_decorator.Beverage;
import ch03_decorator.CondimentDecorator;

public class Soy extends CondimentDecorator {
    Beverage beverage;

    public Soy(final Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", 두유";
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.15;
    }
}
