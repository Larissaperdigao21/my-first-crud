package com.example.crud.myfirstcrud.dto;

import com.example.crud.myfirstcrud.model.Questao;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TemaDTO {

    private Long id;

    private String tema;

    private List<Questao> questaoList;


}
