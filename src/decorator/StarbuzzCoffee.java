package decorator;

public class StarbuzzCoffee {

	public static void main(String[] args) {
		Beverage beverage = new Espresso(1);
		System.out.println(beverage);
		
		Beverage beverage2 = new Espresso(2);
		System.out.println(beverage2);
		
		Beverage beverage3 = new DarkRoast(2);
		beverage3 = new Milk(beverage3);
		beverage3 = new Mocha(beverage3);
		beverage3 = new Whip(beverage3);
		System.out.println(beverage3);
		
		Beverage beverage4 = new HouseBlend(3);
		beverage4 = new Soy(beverage4);
		beverage4 = new Mocha(beverage4);
		beverage4 = new Whip(beverage4);
		System.out.println(beverage4);
		
		Beverage beverage5 = new HouseBlend(4);
		beverage5 = new Soy(beverage5);
		System.out.println(beverage5);
		
	}

}
