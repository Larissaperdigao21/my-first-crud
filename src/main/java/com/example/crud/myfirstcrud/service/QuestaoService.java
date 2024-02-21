package com.example.crud.myfirstcrud.service;

import com.example.crud.myfirstcrud.builder.QuestaoMapper;
import com.example.crud.myfirstcrud.dto.QuestaoDTO;
import com.example.crud.myfirstcrud.model.Questao;
import com.example.crud.myfirstcrud.repository.QuestaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;
import java.util.Optional;

@Service
public class QuestaoService {

    @Autowired
    private QuestaoRepository questaoRepository;
    @Autowired
    private QuestaoMapper questaoMapper;

    public QuestaoDTO salvarQuestao(QuestaoDTO questaoDto) throws Exception {
        Long novaQuestaoId = null;
        if (Objects.nonNull(questaoDto.getId())) {
            novaQuestaoId = questaoDto.getId();
            if (questaoRepository.existsById(novaQuestaoId)) {
                throw new Exception();
            } else {
                return questaoMapper.toDTO(questaoRepository.save(questaoMapper.toEntity(questaoDto)));
            }

        } else {
            return questaoMapper.toDTO(questaoRepository.save(questaoMapper.toEntity(questaoDto)));
        }
    }
    public void apagarQuestao(Long id){
        questaoRepository.deleteById(id);
    }
    public QuestaoDTO buscarPorId(Long id) throws Exception {
        return questaoMapper.toDTO(questaoRepository.findById(id).orElseThrow(Exception::new));
    }
}
