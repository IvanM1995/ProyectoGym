/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades.ProyectoGym;

/**
 *
 * @author Ivan
 */
public class Socio {
     private int id_socio;
    private String dni;
    private String nombre;
    private String apellido;
    private int edad;
    private String correo;
    private String telefono;
    private int contador_asistencia;
    private boolean estado;

    public Socio() {
    }

    public Socio(String dni, String nombre, String apellido, int edad, String correo, String telefono, int contador_asistencia, boolean estado) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.correo = correo;
        this.telefono = telefono;
        this.contador_asistencia = contador_asistencia;
        this.estado = estado;
    }

    public Socio(int id_socio, String dni, String nombre, String apellido, int edad, String correo, String telefono, int contador_asistencia, boolean estado) {
        this.id_socio = id_socio;
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.correo = correo;
        this.telefono = telefono;
        this.contador_asistencia = contador_asistencia;
        this.estado = estado;
    }
    
    public Socio(int id_socio, String dni, String nombre, String apellido, int edad, String correo, String telefono) {
    this.id_socio = id_socio;
    this.dni = dni;
    this.nombre = nombre;
    this.apellido = apellido;
    this.edad = edad;
    this.correo = correo;
    this.telefono = telefono;
}

    public int getId_socio() {
        return id_socio;
    }

    public void setId_socio(int id_socio) {
        this.id_socio = id_socio;
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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getContador_asistencia() {
        return contador_asistencia;
    }

    public void setContador_asistencia(int contador_asistencia) {
        this.contador_asistencia = contador_asistencia;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return nombre +" "+ apellido;
    }

}
