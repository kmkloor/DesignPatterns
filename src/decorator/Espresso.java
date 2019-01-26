package decorator;

public class Espresso extends Beverage{
	
	public Espresso(int i) {
		description = "Espresso";
		size = i;
	}
	
	public double cost() {
		return super.sizeModifier(size, 1.99);
	}

}
