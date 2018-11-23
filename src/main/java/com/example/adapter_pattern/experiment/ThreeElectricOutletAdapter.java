package com.example.adapter_pattern.experiment;

public class ThreeElectricOutletAdapter implements TwoElectricOutlet{
	Xiyiji xiyiji;
    public  ThreeElectricOutletAdapter(Xiyiji xiyiji){
    	this.xiyiji=xiyiji;
    }
	
	public void twoelectrioutlet() {
		xiyiji.threeElectricOutlet();
		
	}

}
