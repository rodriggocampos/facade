package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PacienteTest {

    @Test
    void deveRetornarPendenciaFinanceiroAlta() {
        Paciente paciente = new Paciente();
        FinanceiroHospital.getInstancia().addPacientePendente(paciente);

        assertEquals(false, paciente.receberAlta());
    }

    @Test
    void deveRetornarPendenciaLaboratorioAlta() {
        Paciente paciente = new Paciente();
        Laboratorio.getInstancia().addPacientePendente(paciente);

        assertEquals(false, paciente.receberAlta());
    }

    @Test
    void deveRetornarPendenciaFarmaciaAlta() {
        Paciente paciente = new Paciente();
        Farmacia.getInstancia().addPacientePendente(paciente);

        assertEquals(false, paciente.receberAlta());
    }

    @Test
    void deveRetornarPacienteSemPendenciaAlta() {
        Paciente paciente = new Paciente();

        assertEquals(true, paciente.receberAlta());
    }
}
