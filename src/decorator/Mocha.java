package decorator;

public class Mocha extends CondimentDecorator{
	//instance variable to hold the beverage we are wrapping
	Beverage beverage;
	
	//set the instance variable to the object we are wrapping
	//pass beverage to the decorator's constructor
	public Mocha(Beverage beverage) {
		this.beverage = beverage;
	}
	
	public String getDescription() {
		return beverage.getDescription() + ", Mocha";
	}
	
	public int getSize() {
		return beverage.getSize();
	}
	
	public double cost() {
		int s = size;
		switch (s) {
			case 2: return .25 + beverage.cost();
			case 3: return .30 + beverage.cost();
			default: break;
		}
		return .20 + beverage.cost();
	}
}
