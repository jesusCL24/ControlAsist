package com.AsisteciaControl.Asistencia.servicio;

import com.AsisteciaControl.Asistencia.entidad.Usuario;
import com.AsisteciaControl.Asistencia.repositorio.UsuarioRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioServicioImp implements UsuarioServicio {
    @Autowired
    private UsuarioRepositorio repositorio;

    @Override
    public List<Usuario> listarUsiarios() {
        return repositorio.findAll();
    }

    @Override
    public Usuario guardarUsu(Usuario usuario) {
        return repositorio.save(usuario);
    }

    @Override
    public Usuario obtenerUsuId(long id) {
        return repositorio.findById(id).get();
    }

    @Override
    public Usuario actualizarUsu(Usuario usuario) {
        return repositorio.save(usuario);
    }

    @Override
    public void eliminarUsu(long id) {
        repositorio.deleteById(id);
    }

    @Override
    public List<Usuario> buscar(String appaterno) {
        return repositorio.findByAppaterno(appaterno);
    }
}
