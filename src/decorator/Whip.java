package decorator;

public class Whip extends CondimentDecorator{
	Beverage beverage;

	public Whip(Beverage beverage) {
		this.beverage = beverage;
	}
	
	public String getDescription() {
		return beverage.getDescription() + ", Whip";
	}
	
	public int getSize() {
		return beverage.getSize();
	}
	
	public double cost() {
		int s = size;
		switch (s) {
			case 2: return .15 + beverage.cost();
			case 3: return .20 + beverage.cost();
			default: break;
		}
		return .10 + beverage.cost();
	}
}