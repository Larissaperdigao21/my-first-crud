package com.example.crud.myfirstcrud.service;

import com.example.crud.myfirstcrud.builder.ConfiguracaoMapper;
import com.example.crud.myfirstcrud.builder.TemaMapper;
import com.example.crud.myfirstcrud.dto.ConfiguracaoDTO;
import com.example.crud.myfirstcrud.dto.TemaDTO;
import com.example.crud.myfirstcrud.model.Tema;
import com.example.crud.myfirstcrud.repository.ConfiguracaoRepository;
import com.example.crud.myfirstcrud.repository.TemaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TemaService {
    @Autowired
    private TemaRepository temaRepository;

    private final TemaMapper temaMapper;

    public TemaService(TemaMapper temaMapper) {
        this.temaMapper = temaMapper;
    }

    public TemaDTO buscarPorId(Long id) throws Exception {
        return temaMapper.toDTO(temaRepository.findById(id).orElseThrow(Exception::new));
    }

    public List<TemaDTO> buscarTudo(){
        return temaMapper.toListDTO(temaRepository.findAll());
    }
    public void deletarPorId(Long id){
        temaRepository.deleteById(id);
    }

    public TemaDTO salvar(TemaDTO temaDTO){
        return temaMapper.toDTO(temaRepository.save(temaMapper.toEntity(temaDTO)));
    }
}
