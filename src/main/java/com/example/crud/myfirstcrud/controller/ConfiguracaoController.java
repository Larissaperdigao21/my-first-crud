package com.example.crud.myfirstcrud.controller;

import com.example.crud.myfirstcrud.dto.AlternativaDTO;
import com.example.crud.myfirstcrud.dto.ConfiguracaoDTO;
import com.example.crud.myfirstcrud.service.AlternativaService;
import com.example.crud.myfirstcrud.service.ConfiguracaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/configuracao")
public class ConfiguracaoController {

    @Autowired
    ConfiguracaoService configuracaoService;

    @GetMapping
    public ResponseEntity<List<ConfiguracaoDTO>> mostrarTodasConfiguracoes(){
        return new ResponseEntity<>(configuracaoService.buscarTudo(), HttpStatus.OK);
    }
    @GetMapping("/{id}")
    public ResponseEntity<ConfiguracaoDTO> buscarConfiguracaoPorId(@PathVariable Long id) throws Exception {
        return new ResponseEntity<>(configuracaoService.buscarPorId(id), HttpStatus.OK);
    }

    @PostMapping("/salvar")
    public ResponseEntity<ConfiguracaoDTO> salvarConfiguracao(@RequestBody ConfiguracaoDTO configuracaoDTO){
        return new ResponseEntity<>(configuracaoService.salvarConfiguracao(configuracaoDTO), HttpStatus.CREATED);
    }

    @DeleteMapping("/deletar/{id}")
    public ResponseEntity deletarConfiguracao(@PathVariable Long id){
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}
