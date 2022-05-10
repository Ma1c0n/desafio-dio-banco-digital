package com.banco_digital;

import lombok.AllArgsConstructor;
import lombok.Data;
import java.util.List;
@AllArgsConstructor
@Data
public class Banco {
    private String nome;
    private int numeroBanco;
    private List<Conta> contas;
}
