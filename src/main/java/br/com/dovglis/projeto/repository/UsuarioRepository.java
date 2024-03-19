package br.com.dovglis.projeto.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.dovglis.projeto.entity.UsuarioEntity;

public interface UsuarioRepository extends JpaRepository<UsuarioEntity, Long> {

} 
