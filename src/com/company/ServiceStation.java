package com.company;

public class ServiceStation {

    public void check(Transport transport) {
        System.out.println("Обслуживаем " + transport.getModelName());
        for (int i = 0; i < transport.getWheelsCount(); i++) {
            transport.updateTyre();
        }
        if (transport.getWheelsCount() >= 6) {
            transport.checkEngine();
            transport.checkTrailer();
        } else if (transport.getWheelsCount() >= 4)
            transport.checkEngine();
        System.out.println();
    }

}
