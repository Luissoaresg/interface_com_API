package com.api.API.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.api.API.model.Usuario;
import com.api.API.repository.IUsuario;

@Service
public class UsuarioService {

    private IUsuario repository;

    public UsuarioService(IUsuario repository) {
        this.repository = repository;
    }

    public List<Usuario> listarUsuario() {
        List<Usuario> lista = repository.findAll();
        return lista;
    }

    public Usuario criarUsuario(Usuario usuario) {
        Usuario usuarioNovo = repository.save(usuario);
        return usuarioNovo;
    }

    public Usuario editarUsuario(Usuario usuario) {
        Usuario usuarioEditado = repository.save(usuario);
        return usuarioEditado;
    }

    public boolean excluirUsuario(Integer id) {
        repository.deleteById(id);
        return true;
    }
}