package com.example.decoration_patterns.book_example;

public class Test {

	public static void main(String[] args) {
		Beverage beverage = new Espresso();

		Beverage espressoCoffee = ((Espresso) beverage).creatCoffe("Espresso");
		espressoCoffee = new Mocha(espressoCoffee);
		System.out.println(espressoCoffee.getDescription()+"------>"+ "$"+espressoCoffee.cost());

		Beverage houseBlendCoffe = ((Espresso) beverage).creatCoffe("HouseBlend");
		houseBlendCoffe = new Soy(houseBlendCoffe);
		houseBlendCoffe = new Whip(houseBlendCoffe);
		System.out.println(houseBlendCoffe.getDescription()+"------>"+ "$"+houseBlendCoffe.cost());


//		System.out.println(beverage.getDescription()+" $"+beverage.cost());
//		Beverage beverage2 = new DarKRoast();
//		beverage2 = new Mocha(beverage2);
//		beverage2 = new Whip(beverage2);
//		System.out.println(beverage2.getDescription()+ "$"+beverage2.cost());
//		Beverage beverage3=new HouseBlend();
//		beverage3 =new Soy(beverage3);
//		beverage3 =new Mocha(beverage3);
//		beverage3 = new Whip(beverage3);
//		System.out.println(beverage3.getDescription()+ "$"+beverage3.cost());
		

	}

}
