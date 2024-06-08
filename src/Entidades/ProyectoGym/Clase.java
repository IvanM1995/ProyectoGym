/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades.ProyectoGym;

import java.time.LocalTime;

/**
 *
 * @author Ivan
 */
public class Clase {
     private int id_clase;
    private String nombre;
    private Entrenador id_entrenador;
    private LocalTime horario;
    private int capacidad;
    private boolean estado;

    public Clase() {
    }

    public Clase(String nombre, Entrenador id_entrenador, LocalTime horario, int capacidad, boolean estado) {
        this.nombre = nombre;
        this.id_entrenador = id_entrenador;
        this.horario = horario;
        this.capacidad = capacidad;
        this.estado = estado;
    }

    public Clase(int id_clase, String nombre, Entrenador id_entrenador, LocalTime horario, int capacidad, boolean estado) {
        this.id_clase = id_clase;
        this.nombre = nombre;
        this.id_entrenador = id_entrenador;
        this.horario = horario;
        this.capacidad = capacidad;
        this.estado = estado;
    }

    public int getId_clase() {
        return id_clase;
    }

    public void setId_clase(int id_clase) {
        this.id_clase = id_clase;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Entrenador getId_entrenador() {
        return id_entrenador;
    }

    public void setId_entrenador(Entrenador id_entrenador) {
        this.id_entrenador = id_entrenador;
    }

    public LocalTime getHorario() {
        return horario;
    }

    public void setHorario(LocalTime horario) {
        this.horario = horario;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

}
