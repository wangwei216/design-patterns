package com.example.factory_pattern.example.homework2.demo003;

public class PetShop {

    public Pet CreatePet(String sound) {
        if (sound.equals("呱呱呱")) {
            System.out.println("创建一个鸭子！！！");
            return new Duck();
        }
        if (sound.equals("汪汪汪")) {
            System.out.println("创建一个小狗！！！");
            return new Dog();
        } else {
            System.out.println("没有你想要的宠物----》");
            return null;
        }

    }

}
