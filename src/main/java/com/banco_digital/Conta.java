package com.banco_digital;

import com.banco_digital.interfaces.ServicoBanco;
import com.banco_digital.logica.ServicoBancoA;
import com.banco_digital.modelo.Cliente;
import com.banco_digital.modelo.TipoConta;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
public abstract class Conta {

    @Getter
    private int agencia;

    @Getter
    private int conta;

    @Getter
    private TipoConta tipoConta;

    @Getter
    @Setter
    private double saldo;

    @Getter
    private Cliente cliente;

    @Getter
    private Movimentacao movimentacao = new Movimentacao();

    public Conta() {
        setTipoConta();
    }


    public Conta(int agencia, int conta, double saldo, Cliente cliente) {
        this();
        this.agencia = agencia;
        this.conta = conta;
        this.saldo = saldo;
        this.cliente = cliente;
    }

    public void transferir(Conta contaRecebedora, double valor) {
        servicoBanco.transferir(contaRecebedora, this, valor);
        System.out.println("Você transferiu com sucesso");
    }

    public void sacar(double valor) {
        servicoBanco.sacar(valor, this);
        System.out.println("Você sacou com sucesso");
    }

    public void depositar(double valor) {
        servicoBanco.depositar(valor, this);
        System.out.println("Você depositou com sucesso");
    }

    protected void extrado() {
        servicoBanco.extrato(this);
    }

    private ServicoBanco servicoBanco = new ServicoBancoA(new BancoCentral());

    protected void setTipoConta() {
        if (this instanceof ContaCorrente) {
            tipoConta = TipoConta.CORRENTE;
        } else if (this instanceof ContaPoupanca) {
            tipoConta = TipoConta.POUPANCA;
        }
    }
}
