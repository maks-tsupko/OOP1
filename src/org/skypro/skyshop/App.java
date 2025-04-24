package org.skypro.skyshop;

import org.skypro.skyshop.product.Product;
import org.skypro.skyshop.basket.ProductBasket;

public class App {
    public static void main(String[] args) {
        // Создание продуктов
        Product product1 = new Product("Яблоко", 50);
        Product product2 = new Product("Молоко", 80);
        Product product3 = new Product("Хлеб", 30);
        Product product4 = new Product("Масло", 120);
        Product product5 = new Product("Сыр", 250);
        Product product6 = new Product("Шоколад", 100); // Для проверки заполненной корзины

        // Создание корзины
        ProductBasket basket = new ProductBasket();

        // Демонстрация работы методов корзины
        basket.addProduct(product1);
        basket.addProduct(product2);
        basket.addProduct(product3);
        basket.addProduct(product4);
        basket.addProduct(product5);

        // Проверка добавления в заполненную корзину
        basket.addProduct(product6); // Ожидаем сообщение "Невозможно добавить продукт"

        // Печать содержимого корзины
        basket.printBasketContent();

        // Получение стоимости корзины
        System.out.println("Общая стоимость корзины: " + basket.getTotalPrice());

        // Поиск товара в корзине
        System.out.println("В корзине есть яблоко: " + basket.containsProduct("Яблоко"));
        System.out.println("В корзине есть апельсин: " + basket.containsProduct("Апельсин"));

        // Очистка корзины
        basket.clearBasket();

        // Демонстрация после очистки
        System.out.println("После очистки:");
        basket.printBasketContent();
        System.out.println("Общая стоимость корзины: " + basket.getTotalPrice());
        System.out.println("В корзине есть яблоко: " + basket.containsProduct("Яблоко"));
    }
}