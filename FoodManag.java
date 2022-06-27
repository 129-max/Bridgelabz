package com.example.demo;

import java.util.*;
import java.util.stream.Collectors;

public class FoodManag {
    Set<Fooditmes> foodList = new HashSet();
    Scanner sc = new Scanner(System.in);

    private static FoodManag instance;

    private FoodManag() {}

    public static synchronized FoodManag getInstance() {
        if(instance == null)
            instance = new FoodManag();
        return instance;
    }

    void addFoodItems(Fooditmes foodItmes) {
        foodList.add(foodItmes);
    }

    void printFoodItems() {
        /*
         * for(FoodItmes Items: foodList) { System.out.println(Items); }
         */
        foodList.stream().forEach(System.out::println);
    }

    void removeItem() {
        System.out.print("Enter food item name: ");
        String name = sc.next();
        Fooditmes foodItme = getFoodItem(name);
        if(foodItme != null) {
            foodList.remove(foodItme);
            System.out.println("------"+name+" is removed from food list-------");
            return;
        }
        System.out.println("------"+name+" is not in the list-------");
    }

    void printAllVegItems() {
        foodList.stream().filter(item -> (item.type.equals(item.type.VEG))).forEach(System.out::println);
    }

    public int getFoodCount() {
        return foodList.size();
    }

    void printAllNonVegItems() {
        /*
         * for(FoodItmes elements: foodList) { if(elements instanceof INonVeg)
         * System.out.println(elements); }
         */
        foodList.stream().filter(item -> (item.type.equals(item.type.NONVEG))).forEach(System.out::println);
    }

    Fooditmes getFoodItem(String name) {
        Iterator iterator = foodList.iterator();
        for(Fooditmes elements : foodList ) {
            if (iterator.hasNext()) {
                Fooditmes fooditem = (Fooditmes) iterator.next();
                if(fooditem.name.equalsIgnoreCase(name)) {
                    return fooditem;
                }
            }
        }
        return null;
    }

    public Fooditmes fooditem(String name) {
        List<Fooditmes> result = foodList.stream().filter(item -> item.name.equalsIgnoreCase(name)).collect(Collectors.toList());
        if(!result.isEmpty())
            return result.get(0);
        return null;
    }
}
