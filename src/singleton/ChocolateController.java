package singleton;

public class ChocolateController {
	
	public static void main(String args[]) {
		ChocolateBoiler boiler = ChocolateBoiler.getInstance();
		Chocolate milkChocolate = new Chocolate("Milk Chocolate");
		boiler.fill(milkChocolate);
		System.out.println(milkChocolate.toString());
		boiler.isEmpty();
		boiler.boil();
		System.out.println(milkChocolate.toString());
		boiler.drain();
		
		ChocolateBoiler boiler2 = ChocolateBoiler.getInstance();
		Chocolate darkChocolate = new Chocolate("Dark Chocolate");
		Chocolate whiteChocolate = new Chocolate("White Chocolate");
		boiler2.fill(whiteChocolate);
		System.out.println(whiteChocolate.toString());
		boiler2.fill(darkChocolate);
		System.out.println(darkChocolate.toString());
		boiler2.isEmpty();
		boiler2.boil();
		System.out.println(whiteChocolate.toString());
		System.out.println(darkChocolate.toString());
		boiler2.drain();
	

		
	}

}
