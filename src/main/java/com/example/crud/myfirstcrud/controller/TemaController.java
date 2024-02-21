package com.example.crud.myfirstcrud.controller;

import com.example.crud.myfirstcrud.dto.QuestaoDTO;
import com.example.crud.myfirstcrud.dto.TemaDTO;
import com.example.crud.myfirstcrud.dto.UsuarioDTO;
import com.example.crud.myfirstcrud.model.Tema;
import com.example.crud.myfirstcrud.service.TemaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/tema")
public class TemaController {

    @Autowired
    TemaService temaService;

    @PostMapping("/salvar")
    public TemaDTO salvar(@RequestBody TemaDTO temaDTO){
        return temaService.salvar(temaDTO);
    }

    @GetMapping("/buscar-por-id/{id}")
    public TemaDTO buscarPorId(@PathVariable Long id) throws Exception {
        return temaService.buscarPorId(id);
    }

    @DeleteMapping("/deletar/{id}")
    public ResponseEntity<TemaDTO> deletarPorId(@PathVariable Long id ){
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);

    }


}
