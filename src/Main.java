import model.Apple;
import model.Food;
import model.Meat;
import model.service.ShoppingCart;

import static model.Food.getGoodsCount;
import static model.constants.Colour.*;


public class Main {
    private static Food[] goodsInCart;

    public static void main(String[] args) {
        Food meat = new Meat(5, 100);
        Food redApple = new Apple(10, 50, RED);
        Food greenApple = new Apple(8, 60, GREEN);

        goodsInCart = new Food[getGoodsCount()];

        goodsInCart[0] = meat;
        goodsInCart[1] = redApple;
        goodsInCart[2] = greenApple;



        ShoppingCart cart = new ShoppingCart(goodsInCart);

        System.out.println("Общая сумма всех товаров без скидки " + cart.getCartSum(goodsInCart));
        System.out.println("Сумма скидки для всей корзины " + cart.getCartSumWithDiscount(goodsInCart));
        System.out.println("Сумма всех вегетарианских продуктов без скидки " + cart.getCartSumVeg(goodsInCart));

    }
}
