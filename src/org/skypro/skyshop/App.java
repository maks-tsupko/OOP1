package org.skypro.skyshop;

import org.skypro.skyshop.basket.ProductBasket;
import org.skypro.skyshop.product.DiscountedProduct;
import org.skypro.skyshop.product.FixPriceProduct;
import org.skypro.skyshop.product.SimpleProduct;

public class App {
    public static void main(String[] args) {
        ProductBasket basket = new ProductBasket();

        SimpleProduct product1 = new SimpleProduct("Яблоко", 100);
        DiscountedProduct product2 = new DiscountedProduct("Футболка", 500, 10);
        FixPriceProduct product3 = new FixPriceProduct("Ручка");

        basket.addProduct(product1);
        basket.addProduct(product2);
        basket.addProduct(product3);
        basket.printBasket();
    }
}