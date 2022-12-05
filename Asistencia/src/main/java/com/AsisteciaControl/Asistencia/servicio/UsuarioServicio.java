package com.AsisteciaControl.Asistencia.servicio;

import com.AsisteciaControl.Asistencia.entidad.Usuario;

import java.util.List;

public interface UsuarioServicio {

    public List<Usuario> listarUsiarios();

    public Usuario guardarUsu(Usuario usuario);

    public Usuario obtenerUsuId(long id);

    public Usuario actualizarUsu(Usuario usuario);

    public void eliminarUsu(long id);

    public List<Usuario> buscar(String appaterno);
}
