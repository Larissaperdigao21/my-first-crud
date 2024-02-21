package com.example.crud.myfirstcrud.controller;

import com.example.crud.myfirstcrud.dto.AlternativaDTO;
import com.example.crud.myfirstcrud.service.AlternativaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/alternativa")
public class AlternativaController {

    @Autowired
    AlternativaService alternativaService;

    @GetMapping
    public ResponseEntity<List<AlternativaDTO>> mostrarTodasAlternativas(){
        return new ResponseEntity<>(alternativaService.getAllAlternativa(), HttpStatus.OK);
    }
    @GetMapping("/{id}")
    public ResponseEntity<AlternativaDTO> buscarAlternativaPorId(@PathVariable Long id) throws Exception {
        return new ResponseEntity<>(alternativaService.getAlternativaById(id), HttpStatus.OK);
    }

    @PostMapping("/salvar")
    public ResponseEntity<AlternativaDTO> salvarAlternativa(@RequestBody AlternativaDTO alternativaDTO) {
        return new ResponseEntity<>(alternativaService.salvarAlternativa(alternativaDTO), HttpStatus.CREATED);
    }


    @DeleteMapping("/deletar/{id}")
    public ResponseEntity deletarAlternativa(@PathVariable Long id){
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @PutMapping("/atualizar/{id}")
    public ResponseEntity<AlternativaDTO> atualizarAlternativa(@RequestBody AlternativaDTO alternativaDTO, @PathVariable Long id) throws Exception {
        return new ResponseEntity<>(alternativaService.atualizarAlternativa(alternativaDTO, id), HttpStatus.CREATED);
    }
}
