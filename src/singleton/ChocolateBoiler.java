package singleton;


public class ChocolateBoiler{
	private boolean empty;
	private boolean boiled;
	private Chocolate contents;
	//add static instance
	private static ChocolateBoiler uniqueInstance;
	
	//private class instantiation
	private ChocolateBoiler() {
		contents = null;
		empty = true;
		boiled = false;
	}
	
	//public getInstance to check for existing boiler
	//add synchronized to make each thread wait its turn
	public static synchronized ChocolateBoiler getInstance() {
		if(uniqueInstance == null) {
			uniqueInstance = new ChocolateBoiler();
			System.out.println("Created new boiler");
		}
		else {
			System.out.println("Boiler already exists");
		}
		return uniqueInstance;
		
	}
	
	public void fill(Chocolate chocolate) {
		if(isEmpty()) {
			contents = chocolate;
			empty = false;
			boiled = false;
			System.out.println("Boiler filled with" + chocolate.getName());
		}
		else {
			System.out.println("Boiler already full.");
		}
	}
	
	public void drain() {
		if(!isEmpty() && isBoiled()) {
			contents = null;
			System.out.println("Drained boiler");
			empty = true;
		}
	}
	
	public void boil() {
		if(!isEmpty() && !isBoiled()) {
			contents.setState("liquid");
			System.out.println("Boiled chocolate");
			boiled = true;
		}
	}
		
	
	public boolean isEmpty() {
		return empty;
	}
	
	public boolean isBoiled() {
		return boiled;
	}

}
