package com.banco_digital;

import com.banco_digital.interfaces.ServicoBanco;
import com.banco_digital.logica.ServicoBancoA;
import com.banco_digital.modelo.Cliente;
import com.banco_digital.modelo.TipoConta;

public abstract class Conta {

    private int agencia;

    private int conta;

    private TipoConta tipoConta;

    private double saldo;

    private Cliente cliente;

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

    public Movimentacao getMovimentacao() {
        return movimentacao;
    }

    private ServicoBanco servicoBanco = new ServicoBancoA(new BancoCentral());

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getConta() {
        return conta;
    }

    public void setConta(int conta) {
        this.conta = conta;
    }

    public TipoConta getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(TipoConta tipoConta) {
        this.tipoConta = tipoConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public ServicoBanco getServicoBanco() {
        return servicoBanco;
    }

    public void setServicoBanco(ServicoBanco servicoBanco) {
        this.servicoBanco = servicoBanco;
    }


    @Override
    public String toString() {
        return "Conta{" +
                "agencia=" + agencia +
                ", conta=" + conta +
                ", tipoConta=" + tipoConta +
                ", saldo=" + saldo +
                ", cliente=" + cliente +
                '}';
    }

    protected void setTipoConta() {
        if (this instanceof ContaCorrente) {
            tipoConta = TipoConta.CORRENTE;
        } else if (this instanceof ContaPoupanca) {
            tipoConta = TipoConta.POUPANCA;
        }
    }
}
