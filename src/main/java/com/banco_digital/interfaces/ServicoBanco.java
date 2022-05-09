package com.banco_digital.interfaces;

import com.banco_digital.Conta;

public interface ServicoBanco {
    void transferir(Conta recebedora, Conta pagadora, double valor);

    void sacar(double valor, Conta conta);

    void depositar(double valor, Conta conta);

    void extrato(Conta conta);
}
