package com.example.template_pattern.demo01;

public abstract class Yewu {
	final void prepareRecipe(){
		quhao();
		jutiyewu();
	}
	private void quhao() {
		// TODO Auto-generated method stub
		System.out.println("排队取号");

	}
	abstract void jutiyewu();
}
