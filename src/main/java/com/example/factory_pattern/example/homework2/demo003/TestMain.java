package com.example.factory_pattern.example.homework2.demo003;

public class TestMain {

   public static void main(String[] args){

       PetShop petShop = new PetShop();
       Pet duck = petShop.CreatePet("呱呱呱");
       duck.Show();

       petShop.CreatePet("汪汪汪");
   }

}
