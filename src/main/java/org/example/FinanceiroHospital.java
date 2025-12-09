package org.example;

public class FinanceiroHospital extends SetorHospital {

    private static FinanceiroHospital financeiroHospital = new FinanceiroHospital();

    private FinanceiroHospital() {}

    public static FinanceiroHospital getInstancia() {
        return financeiroHospital;
    }
}

