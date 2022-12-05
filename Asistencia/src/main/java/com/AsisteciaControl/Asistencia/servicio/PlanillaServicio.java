package com.AsisteciaControl.Asistencia.servicio;

import com.AsisteciaControl.Asistencia.entidad.Planilla;

import java.util.List;

public interface PlanillaServicio {

    public List<Planilla> listarPlanillas();

    public Planilla guardarPla(Planilla planilla);

    public Planilla obtenerPlaId(long id);

    public Planilla actualizarPla(Planilla planilla);

    public void eliminarPla(long id);
}
