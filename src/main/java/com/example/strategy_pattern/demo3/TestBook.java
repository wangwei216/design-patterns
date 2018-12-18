package com.example.strategy_pattern.demo3;

public class TestBook extends BookStore {


    @Override
    public void display() {
        System.out.println("我是用来测试的实例对象！");
    }

    public static void main(String[] args) {

        BookStore book001 = new TestBook();
        book001.display();
        book001.setDiscount(new ComputerBook());
        book001.Dazhe(100);

        BookStore book002 = new TestBook();
        book002.display();
        book002.setDiscount(new LanguageBook());
        book002.Dazhe(100);

        BookStore book003 = new TestBook();
        book003.display();
        book003.setDiscount(new NovelBook());
        book003.Dazhe(10000);

    }
}
