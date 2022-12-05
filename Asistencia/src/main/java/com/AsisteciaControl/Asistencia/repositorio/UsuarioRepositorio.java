
package com.AsisteciaControl.Asistencia.repositorio;

import com.AsisteciaControl.Asistencia.entidad.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UsuarioRepositorio extends JpaRepository<Usuario, Long> {
    List<Usuario> findByAppaterno(String appaterno);

}
