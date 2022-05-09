package com.banco_digital;

import com.banco_digital.modelo.Cliente;

public class ContaCorrente extends Conta{

    public ContaCorrente(int agencia, int conta, double saldo, Cliente cliente) {
        super(agencia, conta, saldo, cliente);
    }

    public ContaCorrente() {
        super();
    }
}
