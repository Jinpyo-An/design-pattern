package ch04_factory.store;

import ch04_factory.Pizza;
import ch04_factory.pizza.NYStyleCheesePizza;
import ch04_factory.pizza.NYStyleClamPizza;
import ch04_factory.pizza.NYStylePepperoniPizza;
import ch04_factory.pizza.NYStyleVeggiePizza;

public class NYStylePizzaStore extends PizzaStore{
    @Override
    public Pizza createPizza(String item) {
        if (item.equals("cheese")) {
            return new NYStyleCheesePizza();
        } else if (item.equals("veggie")) {
            return new NYStyleVeggiePizza();
        } else if (item.equals("clam")) {
            return new NYStyleClamPizza();
        } else if (item.equals("pepperoni")) {
            return new NYStylePepperoniPizza();
        } else return null;
    }
}
