package com.api.API.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.API.model.Usuario;

public interface IUsuario extends JpaRepository<Usuario, Integer>{
    
}
