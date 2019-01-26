package decorator;

public class DarkRoast extends Beverage{
	
	public DarkRoast(int i) {
		description = "Dark Roast Coffee";
		size = i;
	}
	
	public double cost() {
		return super.sizeModifier(size, .99);
	}

}

