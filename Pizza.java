package com.example.demo;

public class Pizza extends Fooditmes implements IVeg {
    public Pizza() {
        type = Type.VEG ;
        catagory = Category.STARTER;
        tast = Test.CHEESY;
        preparationTime = 20;
        name = "Pizza";
    }
}
