package model.service;
import model.Food;

public class ShoppingCart {

    Food[] goodsInCart;

    public ShoppingCart(Food[] goodsInCart) {
        this.goodsInCart = goodsInCart;
    }

    public double getCartSum (Food[] ShoppingCart){
        double cartSum = 0.0;
        for (Food food:ShoppingCart) {
            cartSum += food.getAmount() * food.getPrice();
        }
        return cartSum;
    }

    public double getCartSumWithDiscount(Food[] ShoppingCart){
        double cartSum = 0.0;
        for (Food food:ShoppingCart){

            cartSum += food.getAmount() * food.getPrice() * food.getDiscount()/100;
        }
        return cartSum ;
    }

    public double getCartSumVeg(Food[] ShoppingCart){
        double cartSum = 0.0;
        for (Food food:ShoppingCart){
            if(!food.isVegetarian()){
                continue;
            }
            cartSum += food.getAmount() * food.getPrice();
        }
        return cartSum ;
    }
}
