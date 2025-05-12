package org.skypro.skyshop.search;

public class SearchEngine {
    private final org.skypro.skyshop.search.Searchable[] items;
    private int count = 0;

    public SearchEngine(int size) {
        this.items = new org.skypro.skyshop.search.Searchable[size];
    }

    public void add(org.skypro.skyshop.search.Searchable item) {
        if (count < items.length) {
            items[count++] = item;
        }
    }

    public org.skypro.skyshop.search.Searchable[] search(String query) {
        org.skypro.skyshop.search.Searchable[] results = new org.skypro.skyshop.search.Searchable[5];
        int resultCount = 0;

        for (org.skypro.skyshop.search.Searchable item : items) {
            if (item != null && item.getSearchTerm().toLowerCase().contains(query.toLowerCase())) {
                results[resultCount++] = item;
                if (resultCount == 5) {
                    break;
                }
            }
        }

        return results;
    }
}