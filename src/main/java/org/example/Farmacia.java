package org.example;

public class Farmacia extends SetorHospital {

    private static Farmacia farmacia = new Farmacia();

    private Farmacia() {}

    public static Farmacia getInstancia() {
        return farmacia;
    }
}

