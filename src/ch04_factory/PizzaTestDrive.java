package ch04_factory;

import ch04_factory.store.ChicagoStylePizzaStore;
import ch04_factory.store.NYStylePizzaStore;
import ch04_factory.store.PizzaStore;

public class PizzaTestDrive {

    public static void main(String[] args) {
        final PizzaStore nyStore = new NYStylePizzaStore();
        final PizzaStore chicagoStore = new ChicagoStylePizzaStore();

        final Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("에단이 주문한" + pizza.getName());

        final Pizza pizza1 = chicagoStore.orderPizza("cheese");
        System.out.println("조엘이 주문한" + pizza1.getName());
    }
}
