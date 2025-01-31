package ch04_factory.pizza;

import ch04_factory.Pizza;

public class NYStyleCheesePizza extends Pizza {

	public NYStyleCheesePizza() { 
		name = "NY Style Sauce and Cheese Pizza";
		dough = "Thin Crust Dough";
		sauce = "Marinara Sauce";
 
		toppings.add("Grated Reggiano Cheese");
	}

	public void cut() {
		System.out.println("네모난 모양으로 피자 자르기");
	}
}
