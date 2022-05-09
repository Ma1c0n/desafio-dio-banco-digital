package com.banco_digital;

import com.banco_digital.modelo.Cliente;

public class ContaPoupanca extends Conta{

    public ContaPoupanca() {
        super();
    }

    public ContaPoupanca(int agencia, int conta, double saldo, Cliente cliente) {
        super(agencia, conta, saldo, cliente);
    }
}
