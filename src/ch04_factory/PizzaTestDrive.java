package ch04_factory;

import ch04_factory.store.ChicagoStylePizzaStore;
import ch04_factory.store.NYPizzaStore;

public class PizzaTestDrive {

    public static void main(String[] args) {
        final PizzaStore nyStore = new NYPizzaStore();
        final PizzaStore chicagoStore = new ChicagoStylePizzaStore();

        final Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("에단이 주문한" + pizza.getName());

        System.out.println();

        final Pizza pizza1 = chicagoStore.orderPizza("cheese");
        System.out.println("조엘이 주문한 " + pizza1.getName());
    }
}
