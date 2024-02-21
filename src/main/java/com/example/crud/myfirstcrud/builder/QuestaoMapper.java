package com.example.crud.myfirstcrud.builder;

import com.example.crud.myfirstcrud.dto.QuestaoDTO;
import com.example.crud.myfirstcrud.model.Questao;
import com.example.crud.myfirstcrud.model.Usuario;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class QuestaoMapper {

    private final ModelMapper modelMapper;

    public QuestaoMapper(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    public QuestaoDTO toDTO(Questao model) {
        return modelMapper.map(model, QuestaoDTO.class);
    }
    public Questao toEntity(QuestaoDTO dto) {
        return modelMapper.map(dto, Questao.class);
    }

    public List<QuestaoDTO> toListDTO(List<Questao> modelList) {
        return modelList.stream()
                .map(this::toDTO).toList();
    }

    public List<Questao> toList(List<QuestaoDTO> dtosList) {
        return dtosList.stream()
                .map(this::toEntity).toList();
    }
}
