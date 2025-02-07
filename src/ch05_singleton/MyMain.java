package ch05_singleton;

import ch05_singleton.singleton_enum.ChocolateBoiler;

public class MyMain {

    public static void main(String[] args) {
        ChocolateBoiler chocolateBoiler = ChocolateBoiler.CHOCOLATE_BOILER;

        chocolateBoiler.fill();
    }
}
