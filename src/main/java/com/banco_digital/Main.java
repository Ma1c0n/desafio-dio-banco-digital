package com.banco_digital;

import com.banco_digital.dados.DadosFalsos;
import com.banco_digital.modelo.Cliente;
import com.banco_digital.modelo.Sexo;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Banco> bancos = DadosFalsos.carregarDados();

        Conta c1 = bancos.get(0).getContas().get(0);
        Conta c2 = bancos.get(1).getContas().get(1);
        System.out.println(c1);
        System.out.println(c2);

        //transferencia entre contas
        c1.transferir(c2, 500);
        System.out.println(c1);
        System.out.println(c2);

        //deposito
        System.out.println("saldo atual = " + c1);
        c1.depositar(500);
        c1.depositar(500);
        c1.depositar(500);
        System.out.println("saldo atual = " + c1);

        //extrado
        c1.extrado();


        //testes------------
        Cliente c = new Cliente("fsd", 15, "14", Sexo.MASCULINO);
        String nome = c.getNome();
        System.out.println(c);
        System.out.println(nome);
    }
}
