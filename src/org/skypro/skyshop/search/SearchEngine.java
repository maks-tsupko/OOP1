package org.skypro.skyshop.search;

import org.skypro.skyshop.basket.Searchable;
import org.skypro.skyshop.product.Product;

import java.util.ArrayList;
import java.util.List;

public class SearchEngine {
    private List<Searchable> items = new ArrayList<>();

    public void add(Product item) {
        items.add(item);
    }

    public List<Searchable> search(String query) {
        List<Searchable> results = new ArrayList<>();
        for (Searchable item : items) {
            if (item.matches(query)) {
                results.add(item);
            }
        }
        return results;
    }
}