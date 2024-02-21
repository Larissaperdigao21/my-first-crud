package com.example.crud.myfirstcrud.service;


import com.example.crud.myfirstcrud.builder.UsuarioMapper;
import com.example.crud.myfirstcrud.dto.TemaDTO;
import com.example.crud.myfirstcrud.dto.UsuarioDTO;
import com.example.crud.myfirstcrud.model.Usuario;
import com.example.crud.myfirstcrud.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    private UsuarioMapper usuarioMapper;


    public UsuarioDTO salvarUsuario(UsuarioDTO usuarioDTO) {
        Usuario usuarioModel = usuarioMapper.toEntity(usuarioDTO);
        usuarioModel = usuarioRepository.save(usuarioModel);

        return usuarioMapper.toDTO(usuarioModel);
    }

    public List<Usuario> salvarVariosUsuarios(List<Usuario> usuarioLista) {
        return usuarioRepository.saveAll(usuarioLista);
    }

    public UsuarioDTO buscarPorId(Long id) throws Exception {
        return usuarioMapper.toDTO(usuarioRepository.findById(id).orElseThrow(Exception::new));
    }

    public Usuario atualizarUsuario(Usuario usuario) {
        Optional<Usuario> usuarioController = usuarioRepository.findById(usuario.getId());
        return usuarioRepository.save(usuarioController.get());
    }

    public void apagarUsuario(Usuario usuario) {
        usuarioRepository.delete(usuario);
    }

}
