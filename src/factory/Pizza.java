package factory;

//product of PizzaStore
//clients only rely on the abstract type
public abstract class Pizza {
	String name;
	Dough dough;
	Sauce sauce;
	Veggies veggies[];
	Cheese cheese;
	Pepperoni pepperoni;
	Clams clam;
	
	abstract void prepare();
	
	void bake() {
		System.out.println("Bake for 25 minutes at 350");
	}
	
	void cut() {
		System.out.println("Cutting the pizza into diagonal slices");
	}
	
	void box() {
		System.out.println("Place pizza in offical PizzaStore box");
	}
	
	void setName(String name) {
		this.name = name;
	}
	
	String getName() {
		return name;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Pizza Recipe:\n");
		if(dough !=null) {
		sb.append(dough + "\n");
		}
		if(sauce != null) {
		sb.append(sauce + "\n");
		}
		if(cheese != null) {
		sb.append(cheese + "\n");
		}
		if(veggies != null) {
			for (int i = 0; i < veggies.length - 1; i++) {
				sb.append(veggies[i] + ", ");
			}
			sb.append(veggies[veggies.length - 1] + "\n");
		}
		if(pepperoni != null) {
		sb.append(pepperoni + "\n");
		}
		if(clam != null) {
		sb.append(clam + "\n");
		}
		return sb.toString();
	}

}
