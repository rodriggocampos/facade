package org.example;

public class Paciente {

    public boolean receberAlta() {
        return PacienteFacade.verificarPendenciasAlta(this);
    }
}