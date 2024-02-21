package com.example.crud.myfirstcrud.builder;

import com.example.crud.myfirstcrud.dto.AlternativaDTO;
import com.example.crud.myfirstcrud.model.Alternativa;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class AlternativaMapper {

    private final ModelMapper modelMapper;


    public AlternativaMapper(ModelMapper modelMapper){
        this.modelMapper = modelMapper;
    }
    public AlternativaDTO toDTO(Alternativa model){
        return modelMapper.map(model, AlternativaDTO.class);
    }

    public Alternativa toEnity(AlternativaDTO dto){
        return modelMapper.map(dto, Alternativa.class);
    }
    public List<AlternativaDTO> toListDto (List<Alternativa> modelList){
        return modelList.stream().map(this::toDTO).toList();
    }
    public List<Alternativa> toList (List<AlternativaDTO> dtoList){
        return dtoList.stream().map(this::toEnity).toList();
    }
}
