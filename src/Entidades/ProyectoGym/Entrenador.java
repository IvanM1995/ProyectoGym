/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades.ProyectoGym;

/**
 *
 * @author Ivan
 */
public class Entrenador {
     private int id_entrenador;
    private String dni;
    private String nombre;
    private String apellido;
    private String especialidad;
    private String disponibilidad;
    private boolean estado;

    public Entrenador() {
        
        
    }

   

    public Entrenador(String dni, String nombre, String apellido, String especialidad, String disponibilidad, boolean estado) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.especialidad = especialidad;
        this.disponibilidad = disponibilidad;
        this.estado = estado;
    }

    public Entrenador(int id_entrenador, String dni, String nombre, String apellido, String especialidad, String disponibilidad, boolean estado) {
        this.id_entrenador = id_entrenador;
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.especialidad = especialidad;
        this.disponibilidad = disponibilidad;
        this.estado = estado;
    }

    public int getId_entrenador() {
        return id_entrenador;
    }

    public void setId_entrenador(int id_entrenador) {
        this.id_entrenador = id_entrenador;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(String disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        
        return "Entrenador{" + "Dni : " + dni + "; Nombre : " + nombre + "; Apellido : " + apellido + "; Especialidad : " + especialidad + '}';
    }
}
