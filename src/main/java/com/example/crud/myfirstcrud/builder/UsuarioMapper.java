package com.example.crud.myfirstcrud.builder;



import com.example.crud.myfirstcrud.dto.UsuarioDTO;
import com.example.crud.myfirstcrud.model.Usuario;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class UsuarioMapper {

    private final ModelMapper modelMapper;


    public UsuarioMapper(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    public UsuarioDTO toDTO(Usuario model) {
        return modelMapper.map(model, UsuarioDTO.class);
    }

    public Usuario toEntity(UsuarioDTO dto) {
        return modelMapper.map(dto, Usuario.class);
    }

    public List<UsuarioDTO> toListDTO(List<Usuario> modelList) {
        return modelList.stream()
                .map(this::toDTO).toList();
    }

    public List<Usuario> toList(List<UsuarioDTO> dtosList) {
        return dtosList.stream()
                .map(this::toEntity).toList();
    }

}
