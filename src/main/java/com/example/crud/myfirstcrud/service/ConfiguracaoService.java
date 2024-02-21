package com.example.crud.myfirstcrud.service;

import com.example.crud.myfirstcrud.builder.ConfiguracaoMapper;
import com.example.crud.myfirstcrud.dto.ConfiguracaoDTO;
import com.example.crud.myfirstcrud.repository.ConfiguracaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConfiguracaoService {

    private final ConfiguracaoRepository configuracaoRepository;

    private final ConfiguracaoMapper configuracaoMapper;

    public ConfiguracaoService(ConfiguracaoRepository configuracaoRepository, ConfiguracaoMapper configuracaoMapper) {
        this.configuracaoRepository = configuracaoRepository;
        this.configuracaoMapper = configuracaoMapper;
    }

    public ConfiguracaoDTO buscarPorId(Long id) throws Exception {
        return configuracaoMapper.toDTO(configuracaoRepository.findById(id).orElseThrow(Exception::new));
    }

    public List<ConfiguracaoDTO> buscarTudo(){
        return configuracaoMapper.toListDto(configuracaoRepository.findAll());
    }
    public void deletarPorId(Long id){
        configuracaoRepository.deleteById(id);
    }

    public ConfiguracaoDTO salvarConfiguracao(ConfiguracaoDTO configuracaoDTO){
        return configuracaoMapper.toDTO(configuracaoRepository.save(configuracaoMapper.toEnity(configuracaoDTO)));
    }
}
