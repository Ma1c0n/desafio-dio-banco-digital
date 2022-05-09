package com.banco_digital;

import java.util.ArrayList;
import java.util.List;

public class Banco {
    private String nome;
    private int numeroBanco;
    private List<Conta> contas = new ArrayList<>();

    public Banco(String nome, int numeroBanco, List<Conta> contas) {
        this.nome = nome;
        this.numeroBanco = numeroBanco;
        this.contas = contas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumeroBanco() {
        return numeroBanco;
    }

    public void setNumeroBanco(int numeroBanco) {
        this.numeroBanco = numeroBanco;
    }

    public List<Conta> getContas() {
        return contas;
    }

    public void setContas(List<Conta> contas) {
        this.contas = contas;
    }
}
