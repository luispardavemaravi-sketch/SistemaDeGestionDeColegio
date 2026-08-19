package com.colegio.sistema_colegio_backend.repository;

import com.colegio.sistema_colegio_backend.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
    List<Usuario> findByUsername(String username);

    List<Usuario> findByEmail(String email);


}
