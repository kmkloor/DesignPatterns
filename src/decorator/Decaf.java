package decorator;

public class Decaf extends Beverage{
	
	public Decaf(int i) {
		description = "Decaf Coffee";
		size = i;
	}
	
	public double cost() {
		return super.sizeModifier(size, 1.05);
	}

}
