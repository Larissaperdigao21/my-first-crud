package com.example.crud.myfirstcrud.service;

import com.example.crud.myfirstcrud.builder.AlternativaMapper;
import com.example.crud.myfirstcrud.dto.AlternativaDTO;
import com.example.crud.myfirstcrud.model.Alternativa;
import com.example.crud.myfirstcrud.repository.AlternativaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlternativaService {

    @Autowired
    AlternativaRepository alternativaRepository;

    @Autowired
    AlternativaMapper alternativaMapper;

    public AlternativaDTO getAlternativaById(Long id) throws Exception {
        return alternativaMapper.toDTO(alternativaRepository.findById(id).orElseThrow(Exception::new));
    }

    public List<AlternativaDTO> getAllAlternativa(){
        return alternativaMapper.toListDto(alternativaRepository.findAll());
    }
    public AlternativaDTO salvarAlternativa(AlternativaDTO alternativaDTO){
        return alternativaMapper.toDTO(alternativaRepository.save(alternativaMapper.toEnity(alternativaDTO)));
    }
    public void deletarAlternativa(Long id) throws Exception {
        alternativaRepository.delete(alternativaMapper.toEnity(getAlternativaById(id)));
    }
    public AlternativaDTO atualizarAlternativa(AlternativaDTO novaAlternativa, Long id) throws Exception {
        Alternativa alternativaAtualizada = alternativaRepository.findById(id).orElseThrow(Exception::new);

        alternativaAtualizada.setAlternativa(novaAlternativa.getAlternativa());
        alternativaAtualizada.setCorreta(novaAlternativa.isCorreta());

        return alternativaMapper.toDTO(alternativaRepository.save(alternativaAtualizada));
    }

}
