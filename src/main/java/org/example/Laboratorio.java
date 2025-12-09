package org.example;

public class Laboratorio extends SetorHospital {

    private static Laboratorio laboratorio = new Laboratorio();

    private Laboratorio() {}

    public static Laboratorio getInstancia() {
        return laboratorio;
    }
}
