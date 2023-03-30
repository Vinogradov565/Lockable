package org.example;

import org.example.Lockable;
import org.example.Safe;

// Класс, в котором заменяем анонимный класс лямбда-выражением
public class Main {
    public static void main(String[] args) {
        // Создаем объекты
        House house = new House("123 Main St.");
        Safe safe = new Safe(1234);
        Computer computer = new Computer("password");

        // Реализация метода lock() через лямбда-выражение
        Lockable lockable = () -> {
            house.lock();
            safe.lock();
            computer.lock();
        };

        // Вызываем метод lock() через лямбда-выражение
        lockable.lock();
    }
}
