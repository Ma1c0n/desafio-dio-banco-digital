package com.banco_digital.logica;

import com.banco_digital.BancoCentral;
import com.banco_digital.Conta;
import com.banco_digital.interfaces.ServicoBanco;

public class ServicoBancoA implements ServicoBanco {

    private BancoCentral bancoCentral;

    public ServicoBancoA(BancoCentral bancoCentral) {
        this.bancoCentral = bancoCentral;
    }

    @Override
    public void transferir(Conta contaRecebedora, Conta contaPagadora, double valor) {

        if (valor <= contaPagadora.getSaldo()) {
            contaRecebedora.setSaldo(contaRecebedora.getSaldo() + valor);
            contaPagadora.setSaldo(contaPagadora.getSaldo() - valor);
            contaPagadora.getMovimentacao().addTransferencia(valor);
            contaRecebedora.getMovimentacao().addDeposito(valor);
        } else {
            throw new RuntimeException("Não tem saldo!");
        }
    }

    @Override
    public void sacar(double valor, Conta conta) {
        if (conta.getSaldo() >= valor) {
            conta.setSaldo(conta.getSaldo() - valor);
            conta.getMovimentacao().addSaque(valor);
        } else {
            throw new RuntimeException("Não tem saldo!");
        }
    }

    @Override
    public void depositar(double valor, Conta conta) {
        if (valor > 0) {
            conta.setSaldo(conta.getSaldo() + valor);
            conta.getMovimentacao().addDeposito(valor);
        } else {
            throw new RuntimeException("Valor invalido!");
        }
    }

    @Override
    public void extrato(Conta conta) {
        conta.getMovimentacao().getHistorico().forEach(System.out::println);
    }

}
