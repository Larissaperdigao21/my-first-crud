package com.example.crud.myfirstcrud.controller;


import com.example.crud.myfirstcrud.dto.QuestaoDTO;
import com.example.crud.myfirstcrud.dto.UsuarioDTO;
import com.example.crud.myfirstcrud.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @PostMapping("/salvar")
    public UsuarioDTO salvar(@RequestBody UsuarioDTO usuarioDTO){
        return usuarioService.salvarUsuario(usuarioDTO);
    }

    @GetMapping("/{id}")
    public UsuarioDTO findById(@PathVariable Long id) throws Exception {
        return usuarioService.buscarPorId(id);
    }

    @DeleteMapping("/deletar/{id}")
    public ResponseEntity<UsuarioDTO> deletarUsuario(@PathVariable Long id ){
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);

    }

}
