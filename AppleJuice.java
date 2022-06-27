package com.example.demo;
public class AppleJuice extends Fooditmes implements IVeg {
    public AppleJuice() {
        type = Type.VEG ;
        catagory = Category.JUICE;
        tast = Test.SWEET;
        preparationTime = 10;
        name = "AppleJuice";
    }
}
