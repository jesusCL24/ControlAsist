/*
 */
package com.AsisteciaControl.Asistencia.controlador;

import com.AsisteciaControl.Asistencia.entidad.Usuario;
import com.AsisteciaControl.Asistencia.servicio.UsuarioServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
public class UsuarioControlador {

    @Autowired
    private UsuarioServicio servicio;

    @GetMapping({"/usuarios", "/"})
    public String listarUsu(Model modelo) {
        modelo.addAttribute("usuarios", servicio.listarUsiarios());
        return "usuarios";
    }

    @GetMapping("/buscar_Usuario")
    public String mostrarUsu(Model modelo) {
        modelo.addAttribute("usuario", new Usuario());
        return "buscar_Usuario";
    }

    @GetMapping("/buscarUsuario")
    public String buscarUsu(@RequestParam String appaterno, Model modelo, @ModelAttribute("usuario") Usuario usuario) {
        modelo.addAttribute("usuarios", servicio.buscar(appaterno));
        return "buscar_Usuario";
    }

    @GetMapping("/usuarios/nuevo")
    public String crearFormUsuario(Model modelo) {
        Usuario usu = new Usuario();
        modelo.addAttribute("usuario", usu);
        return "crear_usuario";
    }

    @PostMapping("/usuarios")
    public String guardarUsuario(@ModelAttribute("usuario") Usuario usuario) {
        servicio.guardarUsu(usuario);
        return "redirect:/usuarios";

    }

    @GetMapping("/usuarios/editar/{id}")
    public String mostrarFormEdit(@PathVariable long id, Model modelo) {
        modelo.addAttribute("usuario", servicio.obtenerUsuId(id));
        return "editar_usuario";
    }

    @PostMapping("usuarios/{id}")
    public String actualizarUsu(@PathVariable long id, @ModelAttribute("usuario") Usuario usuario, Model modelo) {
        Usuario usuExite = servicio.obtenerUsuId(id);
        usuExite.setId(id);
        usuExite.setNombre(usuario.getNombre());
        usuExite.setAppaterno(usuario.getAppaterno());
        usuExite.setApmaterno(usuario.getApmaterno());
        usuExite.setCarnet(usuario.getCarnet());
        usuExite.setPassword(usuario.getPassword());

        servicio.actualizarUsu(usuExite);
        return "redirect:/usuarios";
    }

    @GetMapping("/usuarios/{id}")
    public String eliminarUsu(@PathVariable long id) {
        servicio.eliminarUsu(id);
        return "redirect:/usuarios";
    }
}
