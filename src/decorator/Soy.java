package decorator;

public class Soy extends CondimentDecorator{
	Beverage beverage;

	public Soy(Beverage beverage) {
		this.beverage = beverage;
	}
	
	public String getDescription() {
		return beverage.getDescription() + ", Soy";
	}
	
	public int getSize() {
		return beverage.getSize();
	}
	
	public double cost() {
		int s = size;
		switch (s) {
			case 2: return .20 + beverage.cost();
			case 3: return .25 + beverage.cost();
			default: break;
		}
		return .15 + beverage.cost();
	}
}
