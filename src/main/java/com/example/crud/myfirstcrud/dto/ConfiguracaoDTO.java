package com.example.crud.myfirstcrud.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ConfiguracaoDTO {

    private Long id;

    private Long moedaInicial;

    private Long pontuacaoPorAcerto;

    private String level;
}
