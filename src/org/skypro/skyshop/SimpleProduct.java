package org.skypro.skyshop;

import org.skypro.skyshop.product.Product;

public class SimpleProduct extends Product {
    public SimpleProduct(String хлеб, int i) {
        super();
    }

    @Override
    public int getPrice() {
        return 0;
    }

    @Override
    public boolean isSpecial() {
        return false;
    }
}
