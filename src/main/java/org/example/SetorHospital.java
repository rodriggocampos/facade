package org.example;

import java.util.ArrayList;
import java.util.List;

public abstract class SetorHospital {

    private List<Paciente> pacientesComPendencia = new ArrayList<Paciente>();

    public void addPacientePendente(Paciente paciente) {
        this.pacientesComPendencia.add(paciente);
    }

    public boolean verificarPacienteComPendencia(Paciente paciente) {
        return this.pacientesComPendencia.contains(paciente);
    }
}
