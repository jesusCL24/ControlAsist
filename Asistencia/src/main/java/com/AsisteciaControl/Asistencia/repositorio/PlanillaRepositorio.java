package com.AsisteciaControl.Asistencia.repositorio;

import com.AsisteciaControl.Asistencia.entidad.Planilla;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlanillaRepositorio extends JpaRepository<Planilla, Long> {
}
