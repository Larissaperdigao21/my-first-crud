package com.example.crud.myfirstcrud.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class QuestaoDTO {

    private Long id;
    private String tema;
    private String pergunta;
    private Integer resposta;

    public QuestaoDTO(String tema, String pergunta, Integer resposta) {
        this.tema = tema;
        this.pergunta = pergunta;
        this.resposta = resposta;
    }
}
