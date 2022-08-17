package model;
import java.util.Objects;
import static model.constants.Colour.*;
import static model.constants.Discount.DISCOUNT_FOR_RED_APPLE;

public class Apple extends Food{
    String colour;


    public Apple(int amount, double price, String colour) {
        super(amount, price, true);
        this.colour = colour;
    }

    @Override
    public double getDiscount() {
        if (Objects.equals(this.colour, RED)){
        return DISCOUNT_FOR_RED_APPLE;
        }else return 0;
    }

}
