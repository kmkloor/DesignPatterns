package decorator;

public class HouseBlend extends Beverage{
	
	public HouseBlend(int i) {
		description = "House Blend Coffee";
		size = i;
	}
	
	public double cost() {
		return super.sizeModifier(size, .89);
	}
	
}
