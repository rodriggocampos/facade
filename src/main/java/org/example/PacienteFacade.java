package org.example;

public class PacienteFacade {

    public static boolean verificarPendenciasAlta(Paciente paciente) {
        if (FinanceiroHospital.getInstancia().verificarPacienteComPendencia(paciente)) {
            return false;
        }
        if (Laboratorio.getInstancia().verificarPacienteComPendencia(paciente)) {
            return false;
        }
        if (Farmacia.getInstancia().verificarPacienteComPendencia(paciente)) {
            return false;
        }
        return true;
    }
}
