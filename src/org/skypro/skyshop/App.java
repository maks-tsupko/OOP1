package org.skypro.skyshop;

import org.skypro.skyshop.article.Article;
import org.skypro.skyshop.basket.ProductBasket;
import org.skypro.skyshop.product.*;
import org.skypro.skyshop.product.DiscountedProduct;
import org.skypro.skyshop.product.FixPriceProduct;
import org.skypro.skyshop.product.SimpleProduct;
import org.skypro.skyshop.search.SearchEngine;
import org.skypro.skyshop.search.Searchable;




public class App {
    public static void main(String[] args) {
        // Товары
        Product p1 = new SimpleProduct("Хлеб", 40);
        Product p2 = new DiscountedProduct("Молоко", 100, 20);
        Product p3 = new FixPriceProduct("Книга");
        Product p4 = new SimpleProduct("Яблоки", 60);
        Product p5 = new FixPriceProduct("Кружка");

        // Корзина
        ProductBasket basket = new ProductBasket();
        basket.addProduct(p1);
        basket.addProduct(p2);
        basket.addProduct(p3);
        basket.addProduct(p4);
        basket.addProduct(p5);

        basket.printBasket();

        // Статьи
        Article a1 = new Article("Как выбрать молоко", "Разбираемся в составе и видах молока");
        Article a2 = new Article("Польза яблок", "Почему яблоки важны для здоровья");
        Article a3 = new Article("Скидки на хлеб", "Новые акции на хлебобулочные изделия");

        // Поисковый движок
        SearchEngine engine = new SearchEngine(10);
        engine.add(p1);
        engine.add(p2);
        engine.add(p3);
        engine.add(p4);
        engine.add(p5);
        engine.add(a1);
        engine.add(a2);
        engine.add(a3);

        // Тест поиска
        printSearchResults(engine.search("молоко"));
        printSearchResults(engine.search("яблок"));
        printSearchResults(engine.search("хлеб"));
        printSearchResults(engine.search("скидки"));
    }

    private static void printSearchResults(Searchable[] results) {
        System.out.println("Результаты поиска:");
        for (Searchable result : results) {
            if (result != null) {
                System.out.println(result.getStringRepresentation());
            }
        }
        System.out.println();
    }

    static {
        try {
            new SimpleProduct("Сок", 20);
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

    }

}



