package ch04_factory.store;

import ch04_factory.Pizza;
import ch04_factory.pizza.ChicagoStyleCheesePizza;

public class ChicagoStylePizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String type) {
        if (type.equals("cheese")) {
            return new ChicagoStyleCheesePizza();
        }
        else return null;
    }
}
