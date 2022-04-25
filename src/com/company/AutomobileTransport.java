package com.company;

public interface AutomobileTransport {
    default void checkEngine() {
        System.out.println("Проверяем двигатель");
    }

    ;
}
