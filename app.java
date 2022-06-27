package com.example.demo;

import java.util.Map;
import java.util.Scanner;
import java.util.Set;


@SuppressWarnings("ALL")
public class app  {
    static FoodManag foodManager =  FoodManag.getInstance();
    static Scanner sc = new Scanner(System.in);
    static Order order = new Order();
    public app() {
        Biryani biryani = new Biryani();
        biryani.price = 250;
        Burgger burgger = new Burgger();
        burgger.price = 30;
        AppleJuice appleJuice = new AppleJuice();
        appleJuice.price = 20;
        Pizza pizza = new Pizza();
        pizza.price = 150;

        app.foodManager.addFoodItems(biryani);
        app.foodManager.addFoodItems(biryani);
        app.FoodManager.addFoodItems(pizza);
        app.foodManager.addFoodItems(appleJuice);
        app.foodManager.addFoodItems(burgger);
        app.showMenu();
    }

    static void showMenu() {
        int choice;
        do {
            System.out.println("\n1. Show food items");
            System.out.println("2. To Update Food Item");
            System.out.println("3. To Add Food Item");
            System.out.println("4. To Remove Food Item");
            System.out.println("5. To Place the order");
            System.out.println("6. To show non veg item");
            System.out.println("7. To show  veg item");
            choice = sc.nextInt();
            switch (choice) {
                case 1 -> foodManager.printFoodItems();
                case 2 -> updateFoodItem();
                case 3 -> addFoodItem();
                case 4 -> foodManager.removeItem();
                case 5 -> {
                    placeOrder();
                    System.out.println(order);
                    getPrice();
                }
                case 6 -> foodManager.printAllNonVegItems();
                case 7 -> foodManager.printAllVegItems();
                default -> choice = 10;
            }
        }while(choice != 10);
    }

    private static void updateFoodItem() {

        System.out.print("Enter food name: ");
        String item = sc.next();
        Fooditmes fooditem = foodManager.getFoodItem(item);
        System.out.println(fooditem);

        System.out.println("1. change test");
        System.out.println("2. change prize");
        System.out.println("3. change preparation time");
        System.out.println("4. change catagory");
        int choice = sc.nextInt();

        switch (choice) {
            case 1 -> updateTest(fooditem);
            case 2 -> {
                System.out.println("Enter new price: ");
                fooditem.price = sc.nextFloat();
            }
            case 3 -> {
                System.out.println("Enter Preparation time: ");
                fooditem.preparationTime = sc.nextShort();
            }
        }
    }

    private static void updateTest(Fooditmes foodItmes) {
        System.out.println("Change test to");
        System.out.println("1. cheesy");
        System.out.println("2. Sweet");
        System.out.println("3. spicy");
        System.out.println("4. chrisppy");
        int test = sc.nextInt();

        switch (test) {
            case 1 -> foodItmes.tast = Fooditmes.Test.CHEESY;
            case 2 -> foodItmes.tast = Fooditmes.Test.SWEET;
            case 3 -> foodItmes.tast = Fooditmes.Test.SPICY;
        }
        System.out.print("fooditems == "+foodItmes);
    }

    private static void addFoodItem() {
        Fooditmes newFoodItem = new Fooditmes() ;
        System.out.print("Enter food item name: ");
        newFoodItem.name = sc.next();

        System.out.println("Select Test: ");
        System.out.println("1. cheesy");
        System.out.println("2. Sweet");
        System.out.println("3. spicy");
        System.out.println("4. chrisppy");
        int test = sc.nextInt();

        switch (test) {
            case 1 -> newFoodItem.tast = Fooditmes.Test.CHEESY;
            case 2 -> newFoodItem.tast = Fooditmes.Test.SWEET;
            case 3 -> newFoodItem.tast = Fooditmes.Test.SPICY;
        }

        System.out.print("Enter new price: ");
        newFoodItem.price = sc.nextFloat();

        System.out.println("Enter Preparation time: ");
        newFoodItem.preparationTime = sc.nextShort();

        System.out.println("food item Select category");
        System.out.println("1. juice");
        System.out.println("2. maincource");
        System.out.println("3. STARTER");
        int category = sc.nextInt();

        switch(category) {
            case 1:
                newFoodItem.catagory = Fooditmes.Category.JUICE;
                break;
            case 2:
                newFoodItem.catagory = Fooditmes.Category.MAINCOURSE;
                break;
            case 3:
                newFoodItem.catagory = Fooditmes.Category.STARTER;
                break;
        }

        System.out.println("food item Select Type");
        System.out.println("1. Veg");
        System.out.println("2. Non Veg");
        int type = sc.nextInt();

        switch (type) {
            case 1 -> newFoodItem.type = Fooditmes.Type.VEG;
            case 2 -> newFoodItem.type = Fooditmes.Type.NONVEG;
        }
        foodManager.addFoodItems(newFoodItem);
        System.out.print("fooditems == "+newFoodItem);
    }

    private static void placeOrder() {
        getFoodItemlist();
        System.out.print("Enter customer Name: ");
        order.customerName = sc.next();
        System.out.print("Enter food item delivery address: ");
        order.deliveryAddress = sc.next();
        order.orderTime = java.time.LocalDateTime.now();
        setPaymentMethod();
        calculateTotalPrice();
    }

    private static void getFoodItemlist() {
        String foodItemName = "";
        while(!foodItemName.equals("quit")) {
            System.out.print("Enter food items name: ");
            foodItemName = sc.next();
            Fooditmes foodItem = foodManager.getFoodItem(foodItemName);
            if(foodItem != null) {
                System.out.print("Enter food item quantity: ");
                Integer quantity = sc.nextInt();
                //order.totalPrice += (foodItem.price * order.quantity);
                order.map.put(foodItem, quantity);
            }
            else if(!foodItemName.equals("quit"))
                System.out.println("food item not present");
        }
    }

    @SuppressWarnings("rawtypes")
    public static void calculateTotalPrice() {
        Set entrySet = order.map.entrySet();
        System.out.println("----->"+entrySet.size());
        for (Object o : entrySet) {
            Map.Entry me = (Map.Entry) o;
            Fooditmes fooditem = (Fooditmes) me.getKey();

            int quantity = (int) me.getValue();
            order.totalPrice += (quantity * fooditem.price);
            System.out.println(order.totalPrice);
        }
    }

    public static void getPrice() {
        order.map.entrySet().stream().map(foodItem -> foodItem.getKey().price * foodItem.getValue()).reduce((float) 0, Float::sum);
        /*
         * entrySet. System.out.println(entrySet.getClass());
         */
    }

    private static void setPaymentMethod() {
        boolean flag = false;
        do {
            System.out.println("1. cash  on delivery");
            System.out.println("2. Credit Card");
            System.out.println("3. Debit Card");
            System.out.println("4. NetBanking");
            System.out.println("5. UPI");
            System.out.println("select payment option");
            int choice = sc.nextInt();
            switch (choice) {
                case 1 -> order.method = Order.payementMethod.COD;
                case 2 -> order.method =
                        Order.payementMethod.CREDIT_CARD;
                case 3 -> order.method = Order.payementMethod.DEBIT_CARD;
                case 4 -> order.method = Order.payementMethod.NETBANKING;
                case 5 -> order.method = Order.payementMethod.UPI;
                default -> {
                    flag = true;
                    System.out.println("Invalid payment option");
                }
            }
        }while(flag);
    }

    private static class FoodManager {
        public static void addFoodItems(Pizza ignoredPizza) {
        }
    }
}
