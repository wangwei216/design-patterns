package com.example.factory_pattern.example.homework2.demo001;

public class TVFactory {

    public static TV produceTV(String brand) throws Exception {
        if (brand.equalsIgnoreCase("Haier")) {
            System.out.println("生产海尔电视机----》");
            return  new HaierTV();
        }
        else if (brand.equalsIgnoreCase("Hisense")) {
            System.out.println("生产海信电视机——————》");
            return  new HisenseTV();
        }
        else {
            System.out.println("暂不生产------》");
        }
        return null;

    }
}