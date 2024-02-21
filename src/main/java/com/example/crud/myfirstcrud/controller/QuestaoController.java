package com.example.crud.myfirstcrud.controller;

import com.example.crud.myfirstcrud.dto.QuestaoDTO;
import com.example.crud.myfirstcrud.dto.TemaDTO;
import com.example.crud.myfirstcrud.service.QuestaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.awt.*;

@RestController
@RequestMapping("/questao")
public class QuestaoController {

    @Autowired
    QuestaoService questaoService;

    @GetMapping("/buscar-por-id/{id}")
    public QuestaoDTO buscarPorId(@PathVariable Long id) throws Exception {
        return questaoService.buscarPorId(id);
    }
    @PostMapping("/salvar")
    public ResponseEntity<QuestaoDTO> salvarQuestao(@RequestBody  QuestaoDTO questaoDTO) throws Exception {
        return new ResponseEntity<>(questaoService.salvarQuestao(questaoDTO),HttpStatus.CREATED);
    }

    @DeleteMapping("/deletar/{id}")
    public ResponseEntity<QuestaoDTO> deletarQuestao(@PathVariable Long id ){
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);

    }
}