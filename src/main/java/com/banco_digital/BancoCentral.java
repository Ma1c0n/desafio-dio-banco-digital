package com.banco_digital;

import com.banco_digital.dados.DadosFalsos;
import java.util.ArrayList;
import java.util.List;

public class BancoCentral {
    private List<Banco> bancos = new ArrayList<>();

    public BancoCentral() {
        bancos = DadosFalsos.bancosFalsos;
    }

    public Conta procurar(String nomeBanco, int agencia, int numeroConta) {
        Banco banco = procurarBranco(nomeBanco);
        if (banco == null) return null;

        Conta conta = procurarConta(banco, agencia, numeroConta);
        if (conta == null) return null;

        return conta;
    }

    private Conta procurarConta(Banco banco, int agencia, int numeroConta) {
        for (Conta conta : banco.getContas()) {
            if (conta.getAgencia() == agencia && conta.getConta() == numeroConta) {
                return conta;
            }
        }
        return null;
    }


    private Banco procurarBranco(String nomeBanco) {
        for (Banco banco : bancos) {
            if (banco.getNome().equals(nomeBanco)) return banco;
        }
        return null;
    }


    public void atualizarContas(Conta recebedora, Conta pagadora) {

    }
}
