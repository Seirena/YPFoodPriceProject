package model;

public abstract class Food implements Discountable {

    private static int goodsCount;

    protected int amount;
    protected double price;
    protected boolean isVegetarian;

    public int getAmount() {
        return amount;
    }

    public double getPrice() {
        return price;
    }


    public Food(int amount, double price, boolean isVegetarian) {
        this();
        this.amount = amount;
        this.price = price;
        this.isVegetarian = isVegetarian;
    }


    public Food() {
        goodsCount++;
    }

    public static int getGoodsCount() {
        return goodsCount;
    }

    public boolean isVegetarian() {
        return isVegetarian;
    }
}
