package org.skypro.skyshop.basket;

import org.skypro.skyshop.product.Product;

public class ProductBasket {

    private final Product[] products = new Product[5];
    private int count = 0;
    private Object[] product;

    public void addProduct(Product product) {
        if (count < products.length) {
            products[count] = product;
            count++;
        } else {
            System.out.println("Невозможно добавить продукт");
        }
    }

    public void printBasket() {
        if (count == 0) {
            System.out.println("В корзине пусто");
            return;
        }

        for (Product product : products) {
            if (product != null) {
                System.out.println(product);
            }
        }
    }

    public void allSum() {
        int total = 0;
        for (Product product : products) {
            total += product.getPrice();
        }
        System.out.println(total + " - общая стоимость");
    }

    public boolean findProductByNane(String name) {
        for (int i = 0; i < products.length; i++) {
            if (products[i].getName().equals(name)) {
                return true;
            }
        }
        return false;
    }

    public void clianBasket() {
        for (int i = 0; i < products.length; i++) {
            products[i] = null;
        }
        System.out.println(products[0] + " пусто");
        System.out.println(products[1] + " пусто");
        System.out.println(products[2] + " пусто");
        System.out.println(products[3] + " пусто");
        System.out.println(products[4] + " пусто");

    }



}
