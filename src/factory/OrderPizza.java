package factory;

public class OrderPizza {
	
	public static void main(String[] args) {
		PizzaStore nyStore = new NYPizzaStore();
		PizzaStore chicagoStore = new ChicagoPizzaStore();
		PizzaStore californiaStore = new CaliforniaPizzaStore();
 
		Pizza pizza = nyStore.orderPizza("cheese");
		System.out.println(pizza);
 
		pizza = nyStore.orderPizza("clam");
		System.out.println(pizza);
		
		pizza = nyStore.orderPizza("pepperoni");
		System.out.println(pizza);
 
		pizza = nyStore.orderPizza("veggie");
		System.out.println(pizza);
 
		pizza = chicagoStore.orderPizza("cheese");
		System.out.println(pizza);
		
		pizza = chicagoStore.orderPizza("clam");
		System.out.println(pizza);
		
		pizza = chicagoStore.orderPizza("pepperoni");
		System.out.println(pizza);

		pizza = chicagoStore.orderPizza("veggie");
		System.out.println(pizza);
		
		pizza = californiaStore.orderPizza("cheese");
		System.out.println(pizza);
		
		pizza = californiaStore.orderPizza("clam");
		System.out.println(pizza);
		
		pizza = californiaStore.orderPizza("pepperoni");
		System.out.println(pizza);

		pizza = californiaStore.orderPizza("veggie");
		System.out.println(pizza);
	}

}
