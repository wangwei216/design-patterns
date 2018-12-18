package com.example.factory_pattern.example.example;

public class Test {

    public static void main(String[] args) {

        PhoneFactory appleFactory = new AppleFactory();
        PhoneFactory huaweiFactory = new HuaweiFactory();
        PhoneFactory meizuFactory = new MeizuFactory();
        Phone iPhone8 = appleFactory.newInstance();
        Phone iPhoneX = appleFactory.newInstance();
        Phone Mate20 = huaweiFactory.newInstance();
        Phone mx5 = meizuFactory.newInstance();


        PartsAbstractFactory shellFactory = PartsFactoryProducer.getFactory("Shell");
        PhoneShell phoneShell = shellFactory.getShell("High");

        iPhoneX.display();
        iPhone8.performPhoneScreen();
        Mate20.performPhoneShell();
        mx5.display();
        mx5.performPhoneShell();
        mx5.setPhoneShell(phoneShell);
        mx5.performPhoneShell();
    }
}
