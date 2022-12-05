package com.AsisteciaControl.Asistencia.entidad;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "planilla")
public class Planilla {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "fecha", nullable = false)
    private LocalDateTime fecha;
    @Column(name = "carrera", nullable = false, length = 30)
    private String carrera;
    @Column(name = "docente", nullable = false, length = 30)
    private String docente;
    @Column(name = "horario", nullable = false, length = 30)
    private String horario;
    @Column(name = "paralelo", nullable = false, length = 30)
    private String paralelo;
    @Column(name = "cantidadEstudiante", nullable = false)
    private long cantidadEstudiante;

    public Planilla() {

    }

    public Planilla(long id, LocalDateTime fecha, String carrera, String docente, String horario, String paralelo, long cantidadEstudiante) {
        this.id = id;
        this.fecha = fecha;
        this.carrera = carrera;
        this.docente = docente;
        this.horario = horario;
        this.paralelo = paralelo;
        this.cantidadEstudiante = cantidadEstudiante;
    }

    public Planilla(LocalDateTime fecha, String carrera, String docente, String horario, String paralelo, long cantidadEstudiante) {
        this.fecha = fecha;
        this.carrera = carrera;
        this.docente = docente;
        this.horario = horario;
        this.paralelo = paralelo;
        this.cantidadEstudiante = cantidadEstudiante;
    }

    @PrePersist
    public void asignarFecha() {
        fecha = LocalDateTime.now();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getDocente() {
        return docente;
    }

    public void setDocente(String docente) {
        this.docente = docente;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getParalelo() {
        return paralelo;
    }

    public void setParalelo(String paralelo) {
        this.paralelo = paralelo;
    }

    public long getCantidadEstudiante() {
        return cantidadEstudiante;
    }

    public void setCantidadEstudiante(long cantidadEstudiante) {
        this.cantidadEstudiante = cantidadEstudiante;
    }
}
