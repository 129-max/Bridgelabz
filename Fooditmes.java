package com.example.demo;
import java.util.Objects;
interface IVeg {}

interface INonVeg{}
public class Fooditmes {
    enum Test{ SPICY, SWEET, CRISPPY, CHEESY}
    enum Category{MAINCOURSE, STARTER, JUICE}
    enum Type{VEG, NONVEG}

    String name;
    Type type;
    Category catagory;
    Test tast;
    short preparationTime;
    float price;


    @Override
    public int hashCode() {
        return Objects.hash(catagory, name, preparationTime, price, tast, type);
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Fooditmes other = (Fooditmes) obj;
        return catagory == other.catagory && Objects.equals(name, other.name)
                && preparationTime == other.preparationTime
                && Float.floatToIntBits(price) == Float.floatToIntBits(other.price) && tast == other.tast
                && type == other.type;
    }


    @Override
    public String toString() {
        return "FoodItems [name=" + name + ", type=" + type + ", catagory=" + catagory + ", tast=" + tast
                + ", preparationTime=" + preparationTime + ", price=" + price + "]";
    }

}
