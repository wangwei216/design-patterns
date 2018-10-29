package com.example.decoration_patterns.homework1;

public class Nutty extends IcecreamDecorator {

	  public Nutty(Icecream specialIcecream) {
	    super(specialIcecream);
	  }

	  public String makeIcecream() {
	    return specialIcecream.makeIcecream() + addNuts();
	  }

	  private String addNuts() {
	    return " + 添加坚果材料";
	  }
}
