package decorator;

public abstract class Beverage {
	String description = "Unknown Beverage";
	// 1 = tall, 2 = grande, 3 = venti
	int size = 0;
	
	public String getDescription() {
		return description;
	}
	
	public abstract double cost();
	
	
	public int getSize() {
		return size;
	}
	
	public void setSize(int size) {
		this.size = size;
	}
	
	public double sizeModifier(int size, double cost){
		switch(size) {
			case 2: return cost * 1.25;
			case 3: return cost * 1.5;
			default: return cost;
		}
	}
	
	@Override
	public String toString() { 
		String sizeDescription = "";
		switch(getSize()) {
			case 1: sizeDescription = "Tall";
				break;
			case 2: sizeDescription = "Grande";
				break;
			case 3: sizeDescription = "Venti";
				break;
			default: return "Cannot place order, invalid beverage size:" + size;
		}
		
		//(double)Math.round(value * 100d) / 100d rounds double where 0s are places after decimal
        return sizeDescription + " " + getDescription() + " $" + (double)Math.round(cost() * 100d) / 100d; 
    } 
}
