package com.banco_digital.modelo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@Data
@AllArgsConstructor
@ToString
public class Cliente {
    private String nome;
    private int dataNascimento;
    private String cpf;
    private Sexo sexo;
}
