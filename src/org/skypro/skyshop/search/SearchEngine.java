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
    public org.skypro.skyshop.search.Searchable findBestMatch(String search) throws BestResultNotFound {
        if (search == null || search.isEmpty()) {
            throw new BestResultNotFound("Поисковый запрос не должен быть пустым");
        }

        org.skypro.skyshop.search.Searchable best = null;
        int maxCount = 0;

        for (org.skypro.skyshop.search.Searchable item : items) {
            if (item != null) {
                int count = countOccurrences(item.getSearchTerm().toLowerCase(), search.toLowerCase());
                if (count > maxCount) {
                    maxCount = count;
                    best = item;
                }
            }
        }

        if (best == null) {
            throw new BestResultNotFound("Не найдено ни одного подходящего результата для запроса: " + search);
        }

        return best;
    }

    private int countOccurrences(String lowerCase, String lowerCase1) {
        return 0;
    }
}