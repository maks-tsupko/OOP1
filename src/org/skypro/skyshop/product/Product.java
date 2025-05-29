package org.skypro.skyshop.product;

public abstract class Product extends org.skypro.skyshop.basket.Searchable implements org.skypro.skyshop.product.Searchable {
    private final String name;
    protected int discountPercent;

    public Product(String name, String s) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Название продукта не может быть пустым или null");
        }
        this.name = name;
    }

    public Product(String name, String s, String name1) {
        this.name = name1;
    }


    public String getName() {
        return name;
    }

    public abstract int getPrice();
    public abstract boolean isSpecial();

    @Override
    public String getSearchTerm() {
        return name;
    }

    @Override
    public String getType() {
        return "PRODUCT";
    }

    public boolean getStringRepresentation() {

        return false;
    }
}