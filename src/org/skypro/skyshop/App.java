package org.skypro.skyshop;

import org.skypro.skyshop.basket.ProductBasket;
import org.skypro.skyshop.product.Product;

public class App {
    public static void main(String[] args) {
        Product product1 = new Product("Яблоко", 50);
        Product product2 = new Product("Молоко", 80);
        Product product3 = new Product("Хлеб", 30);
        Product product4 = new Product("Масло", 120);
        Product product5 = new Product("Сыр", 250);


        ProductBasket basket = new ProductBasket();
        basket.addProduct(product1);
        basket.addProduct(product2);
        basket.addProduct(product3);
        basket.addProduct(product4);
        basket.addProduct(product5);


        basket.printBasket();

        basket.allSum();

        if (basket.findProductByNane("Рыба")) {
            System.out.println("Есть в карзине");
        } else {
            System.out.println("Нет в карзине");
        }

        basket.clianBasket();






    }


}
