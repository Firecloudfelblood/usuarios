package com.erivalaxl.usuarios.persistence;

import com.erivalaxl.usuarios.model.Usuarios;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UsuariosRepository extends JpaRepository<Usuarios, Integer> {
    public List<Usuarios> findById(int id);
}
