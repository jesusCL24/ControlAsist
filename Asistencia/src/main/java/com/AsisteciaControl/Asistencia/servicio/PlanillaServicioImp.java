package com.AsisteciaControl.Asistencia.servicio;

import com.AsisteciaControl.Asistencia.entidad.Planilla;
import com.AsisteciaControl.Asistencia.repositorio.PlanillaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlanillaServicioImp implements PlanillaServicio {
    @Autowired
    private PlanillaRepositorio repositorio;

    @Override
    public List<Planilla> listarPlanillas() {
        return repositorio.findAll();
    }

    @Override
    public Planilla guardarPla(Planilla planilla) {
        return repositorio.save(planilla);
    }

    @Override
    public Planilla obtenerPlaId(long id) {
        return repositorio.findById(id).get();
    }

    @Override
    public Planilla actualizarPla(Planilla planilla) {
        return repositorio.save(planilla);
    }

    @Override
    public void eliminarPla(long id) {
        repositorio.deleteById(id);
    }
}
