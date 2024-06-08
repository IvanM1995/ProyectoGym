/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades.ProyectoGym;

import java.sql.Date;
import java.sql.Time;

/**
 *
 * @author Ivan
 */
public class Asistencia {
      private int id_asistencia;
    private Socio id_socio;
    private Clase id_clase;
    private Date fecha_asistencia;
    private Time hora_asistencia;
    private boolean estado;

    public Asistencia() {
    }

    public Asistencia(Socio id_socio, Clase id_clase, Date fecha_asistencia, Time hora_asistencia, boolean estado) {
        this.id_socio = id_socio;
        this.id_clase = id_clase;
        this.fecha_asistencia = fecha_asistencia;
        this.hora_asistencia = hora_asistencia;
        this.estado = estado;
    }

    public Asistencia(int id_asistencia, Socio id_socio, Clase id_clase, Date fecha_asistencia, Time hora_asistencia, boolean estado) {
        this.id_asistencia = id_asistencia;
        this.id_socio = id_socio;
        this.id_clase = id_clase;
        this.fecha_asistencia = fecha_asistencia;
        this.hora_asistencia = hora_asistencia;
        this.estado = estado;
    }

    public int getId_asistencia() {
        return id_asistencia;
    }

    public void setId_asistencia(int id_asistencia) {
        this.id_asistencia = id_asistencia;
    }

    public Socio getId_socio() {
        return id_socio;
    }

    public void setId_socio(Socio id_socio) {
        this.id_socio = id_socio;
    }

    public Clase getId_clase() {
        return id_clase;
    }

    public void setId_clase(Clase id_clase) {
        this.id_clase = id_clase;
    }

    public Date getFecha_asistencia() {
        return fecha_asistencia;
    }

    public void setFecha_asistencia(Date fecha_asistencia) {
        this.fecha_asistencia = fecha_asistencia;
    }

    public Time getHora_asistencia() {
        return hora_asistencia;
    }

    public void setHora_asistencia(Time hora_asistencia) {
        this.hora_asistencia = hora_asistencia;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Asistencia{" + "id_asistencia=" + id_asistencia + ", id_socio=" + id_socio + ", id_clase=" + id_clase + ", fecha_asistencia=" + fecha_asistencia + ", hora_asistencia=" + hora_asistencia + ", estado=" + estado + '}';
    }
}
