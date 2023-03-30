package org.example;

// Класс House
public class House implements Lockable {
    private String address;
    private boolean locked;

    public House(String address) {
        this.address = address;
        this.locked = false;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void open() {
        System.out.println("House is open");
    }

    // Реализация метода lock() через анонимный класс
    public void lock() {
        Lockable lockable = new Lockable() {
            @Override
            public void lock() {
                locked = true;
                System.out.println("House is locked");
            }
        };
        lockable.lock();
    }
}
