package com.example.crud.myfirstcrud.builder;

import com.example.crud.myfirstcrud.dto.TemaDTO;
import com.example.crud.myfirstcrud.dto.UsuarioDTO;
import com.example.crud.myfirstcrud.model.Tema;
import com.example.crud.myfirstcrud.model.Usuario;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class TemaMapper {

    private ModelMapper modelMapper;

    public TemaMapper(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    public TemaDTO toDTO(Tema model){
        return modelMapper.map(model, TemaDTO.class);
    }

    public Tema toEntity(TemaDTO dto){
        return modelMapper.map(dto, Tema.class);
    }

    public List<TemaDTO> toListDTO(List <Tema> modelList){
        return modelList.stream()
                .map(this::toDTO).toList();
    }

    public List<Tema> toList(List<TemaDTO> dtosList){
        return dtosList.stream()
                .map(this::toEntity).toList();
    }

}
