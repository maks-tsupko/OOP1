package org.skypro.skyshop.search;

import org.skypro.skyshop.product.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductBasket {
    private final Map<String, List<Product>> products = new HashMap<>();
    //private List<Product> products = new ArrayList<>();

    //public void addProduct(Product product) {
    public void addProduct(Product product) {
        products.computeIfAbsent(product.getName(), k -> new ArrayList<>()).add(product);
    }

    public void printBasket() {
        System.out.println("Товары в корзине:");
        for (List<Product> productList : products.values()) {
            for (Product product : productList) {
                System.out.println(product.getStringRepresentation());
            }
        }
    }

    public List<Product> removeByName(String молоко) {
        return List.of();
    }
}
