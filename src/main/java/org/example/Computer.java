package org.example;

// Класс Computer
public class Computer implements Lockable {
    private String password;
    private boolean locked;

    public Computer(String password) {
        this.password = password;
        this.locked = false;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void turnOn() {
        System.out.println("Computer is on");
    }

    // Реализация метода lock() через анонимный класс
    public void lock() {
        Lockable lockable = new Lockable() {
            @Override
            public void lock() {
                locked = true;
                System.out.println("Computer is locked");
            }
        };
        lockable.lock();
    }
}
