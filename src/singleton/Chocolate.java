package singleton;

public class Chocolate {
	String name;
	String state;
	
	public Chocolate(String name) {
		this.name = name;
		state = "solid";
	}
	
	public void setState(String state) {
		this.state = state;
	}
	
	public String getName() {
		return name;
	}
	
	@Override
	public String toString() {
		return name + " is " + state;
	}

}
