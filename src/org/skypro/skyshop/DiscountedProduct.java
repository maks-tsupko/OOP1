package org.skypro.skyshop;

import org.skypro.skyshop.product.Product;

public class DiscountedProduct extends Product {
    public DiscountedProduct(String молоко, int i, int i1) {
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
