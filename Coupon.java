package com.example.demo;

public class Coupon {
    public static void main(String[] args) {
        day6 utility = new day6();
        System.out.print("Enter number of coupons to generat n: " );
        int numberOfCoupns = utility.getIntValue();
        System.out.print("Enter Size of coupons: " );
        int sizeOfCoupon = utility.getIntValue();
        day6.getCoupons(numberOfCoupns,sizeOfCoupon);

    }
}
