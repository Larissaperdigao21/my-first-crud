package com.example.crud.myfirstcrud.builder;

import com.example.crud.myfirstcrud.dto.AlternativaDTO;
import com.example.crud.myfirstcrud.dto.ConfiguracaoDTO;
import com.example.crud.myfirstcrud.model.Alternativa;
import com.example.crud.myfirstcrud.model.Configuracao;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ConfiguracaoMapper {

    private final ModelMapper modelMapper;


    public ConfiguracaoMapper(ModelMapper modelMapper){
        this.modelMapper = modelMapper;
    }
    public ConfiguracaoDTO toDTO(Configuracao model){
        return modelMapper.map(model, ConfiguracaoDTO.class);
    }

    public Configuracao toEnity(ConfiguracaoDTO dto){
        return modelMapper.map(dto, Configuracao.class);
    }
    public List<ConfiguracaoDTO> toListDto (List<Configuracao> modelList){
        return modelList.stream().map(this::toDTO).toList();
    }
    public List<Configuracao> toList (List<ConfiguracaoDTO> dtoList){
        return dtoList.stream().map(this::toEnity).toList();
    }
}
