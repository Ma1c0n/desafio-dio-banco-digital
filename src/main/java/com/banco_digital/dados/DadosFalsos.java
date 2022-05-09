package com.banco_digital.dados;

import com.banco_digital.Banco;
import com.banco_digital.Conta;
import com.banco_digital.ContaCorrente;
import com.banco_digital.ContaPoupanca;
import com.banco_digital.modelo.Cliente;
import com.banco_digital.modelo.Sexo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DadosFalsos {

    public static List<Banco> bancosFalsos = carregarDados();

    public static List<Banco> carregarDados() {
        List<Banco> bancos = new ArrayList<>();
        bancos.add(new Banco("banco A", 150, contasBancoA()));
        bancos.add(new Banco("banco B", 150, contasBancoB()));

        return bancos;
    }

    private static List<Conta> contasBancoA() {
        return Arrays.asList(
                new ContaCorrente(1000, 154646, 1500, new Cliente("lucas", 1910, "1546789741", Sexo.MASCULINO)),
                new ContaPoupanca(910, 154746, 808, new Cliente("maria", 2002, "154453289741", Sexo.FEMININO))
        );
    }

    private static List<Conta> contasBancoB() {
        return Arrays.asList(
                new ContaPoupanca(3512, 154646, 978, new Cliente("paulo", 1988, "1546789741", Sexo.MASCULINO)),
                new ContaCorrente(1547, 4567, 10000, new Cliente("lucia", 2005, "154453289741", Sexo.FEMININO))
        );
    }
}
