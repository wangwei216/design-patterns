package com.example.decoration_patterns.book_example;

public class HouseBlend extends Beverage implements CoffeFactory {

    public HouseBlend() {
        description = "House blend Coffee";
    }

    public double cost() {
        // TODO Auto-generated method stub
        return 0.89;
    }


    @Override
    public Beverage creatCoffe(String type) {
        if (type.equals("HouseBlend")) {
            System.out.println("创建了一个HouseBlend类型的Coffee");
            return new HouseBlend();

        } else if (type.equals("DarKRoast")) {
            System.out.println("创建了一个DarKRoast类型的Coffee");
            return new DarKRoast();

        } else if (type.equals("Decat")) {
            System.out.println("创建了一个Decat类型的Coffee");
            return new Decat();

        } else {
            System.out.println("创建了一个Espresso类型的Coffee");
            return new Espresso();
        }
    }
}
