package com.example.strategypattern.demo3;

public abstract class BookStore {

    //把接口对象当成成员变量
   private Discount discount;


    public abstract void  display();


    public void Dazhe(int pirce){
        double sum = discount.BookDiscount(pirce);
//        System.out.println("打折后的价格为："+ sum);

    }

    public void setDiscount(Discount discount) {
        this.discount = discount;
    }
}
