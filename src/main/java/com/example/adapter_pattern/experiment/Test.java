package com.example.adapter_pattern.experiment;


public class Test {
	public static void main(String[] args){
		Tv twoElectricoutle= new Tv();
		Xiyiji threeElectricoutle= new Xiyiji();
		TwoElectricOutlet threeElectricoutleadapter = new ThreeElectricOutletAdapter(threeElectricoutle);
		System.out.println("我是电视------->");
		threeElectricoutle.threeElectricOutlet();
		System.out.println("我是洗衣机------>");
		testtwoelectricOutlet(threeElectricoutleadapter);
	}
	static void testtwoelectricOutlet(TwoElectricOutlet twoelectricoutlet){
		twoelectricoutlet.twoelectrioutlet();
	}

}
