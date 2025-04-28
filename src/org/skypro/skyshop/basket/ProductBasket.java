package org.skypro.skyshop.basket;

import org.skypro.skyshop.product.Product;

import java.util.Arrays;

public class ProductBasket {

    private final Product[] products = new Product[5];
    private int count = 0;


    public void addProduct(Product product) {
        if (count < products.length) {
            products[count] = product;
            count++;
        } else {
            System.out.println("Невозможно добавить продукт");
        }
    }

    public int getTotalPrice() {
        return Arrays.stream(products).filter(p -> p != null).mapToInt(Product::getPrice).sum();
    }

    public void printBasket() {
        if (count == 0) {
            System.out.println("в корзине пусто");
            return;
        }
        for (Product product : products) {
            if (product != null) {
                System.out.println(product);
            }
        }
        System.out.println("Итого: " + getTotalPrice());
        System.out.println("Специальных товаров: " + Arrays.stream(products).filter(p -> p != null && p.isSpecial()).count());
    }

    public boolean containsProduct(String name) {
        for (Product product : products) {
            if (product != null && product.getName().equals(name)) {
                return true;
            }
        }
        return false;
    }

    public void clear() {
        Arrays.fill(products, null);
        count = 0;
    }
}
