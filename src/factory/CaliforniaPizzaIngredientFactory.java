package factory;

public class CaliforniaPizzaIngredientFactory implements PizzaIngredientFactory {

	public Dough createDough() {
		return new VeryThinCrust();
	}

	public Sauce createSauce() {
		return new BruschettaSauce();
	}

	public Cheese createCheese() {
		return new GoatCheese();
	}

	public Veggies[] createVeggies() {
		Veggies veggies[] = {new Garlic(), new Onion(), new Mushroom(), new RedPepper()};
		return veggies;
	}

	public Pepperoni createPepperoni() {
		return new SlicedPepperoni();
	}

	public Clams createClam() {
		return new Calamari();
	}

}

