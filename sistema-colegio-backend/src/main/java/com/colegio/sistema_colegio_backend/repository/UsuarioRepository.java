package com.colegio.sistema_colegio_backend.repository;

import com.colegio.sistema_colegio_backend.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario,Integer> {
    Usuario findByUsername(String username);
    Usuario findByEmail(String email);
    Usuario findByDni(String dni);

}
