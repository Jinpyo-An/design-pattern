package ch03_decorator.beverage;

import ch03_decorator.Beverage;

public class HouseBlend extends Beverage {
    public HouseBlend() {
        super("하우스 블렌드 커피");
    }

    @Override
    public double cost() {
        return 0.89;
    }
}
