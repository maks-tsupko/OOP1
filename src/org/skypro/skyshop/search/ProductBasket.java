package org.skypro.skyshop.search;

import org.skypro.skyshop.product.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductBasket {
    private List<Product> products = new ArrayList<>();

    public void addProduct(Product product) {
        products.add(product);
    }

    public void printBasket() {
        System.out.println("Корзина:");
        for (Product product : products) {
            System.out.println(product.getStringRepresentation());
        }
        System.out.println();
    }

    public List<Product> removeByName(String молоко) {
        return List.of();
    }
}
