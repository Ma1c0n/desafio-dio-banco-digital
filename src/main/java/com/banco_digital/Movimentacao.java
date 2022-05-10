package com.banco_digital;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Movimentacao {
    private final List<String> historico = new ArrayList<>();

    public void addSaque(double valor) {
        historico.add("Saque no valor de: " + valor + " no horario: " + System.currentTimeMillis());
    }

    public void addTransferencia(double valor) {
        historico.add("Transferencia no valor de: " + valor + " no horario: " + System.currentTimeMillis());
    }

    public void addDeposito(double valor) {
        historico.add("Deposito no valor de: " + valor + " no horario: " + System.currentTimeMillis());
    }

    public void apagarHistorico() {
        historico.clear();
    }
}
