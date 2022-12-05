package com.AsisteciaControl.Asistencia.controlador;

import com.AsisteciaControl.Asistencia.entidad.Planilla;
import com.AsisteciaControl.Asistencia.servicio.PlanillaServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class PlanillaControlador {
    @Autowired
    private PlanillaServicio servicio;

    @GetMapping({"/planillas", "/"})
    public String listarUsu(Model modelo) {
        modelo.addAttribute("planillas", servicio.listarPlanillas());
        return "planillas";
    }

    @GetMapping("/planillas/nuevo")
    public String crearFormPlanilla(Model modelo) {
        Planilla planilla = new Planilla();
        modelo.addAttribute("planilla", planilla);
        return "crear_planilla";
    }

    @PostMapping("/planillas")
    public String guardarPlanilla(@ModelAttribute("planilla") Planilla planilla) {
        servicio.guardarPla(planilla);
        return "redirect:/planillas";
    }
/*
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
    }*/
}
