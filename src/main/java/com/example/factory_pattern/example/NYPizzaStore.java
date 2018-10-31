package com.example.factory_pattern.example;

public class NYPizzaStore {
	public static Object createPizza(Class<? extends Pizza> clazz){

		Object obj = null;
		try {
			obj = Class.forName(clazz.getName()).newInstance();
			System.out.println("我是"+obj.getClass().getName()+"店铺----->已经被创建成功了");

		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		return obj;
		

	}
}
