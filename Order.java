package com.example.demo;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

public class Order {
    enum payementMethod {COD, CREDIT_CARD, DEBIT_CARD, NETBANKING, UPI,
        /**
         *
         */
 WALLET}
    String deliveryAddress;
    String customerName;
    float totalPrice = 0;
    LocalDateTime orderTime;
    payementMethod method;
    Map<Fooditmes, Integer> map = new HashMap<>();

    @Override
    public String toString() {
        return "Order [deliveryAddress=" + deliveryAddress + ", customerName=" + customerName + ", totalPrice="
                + totalPrice + ", orderTime=" + orderTime + ", method=" + method + ", map=" + map + "]";
    }
}
